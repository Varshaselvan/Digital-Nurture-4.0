import java.sql.*;

public class TransactionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database"; // Change as needed
        String user = "your_username";
        String password = "your_password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            transferMoney(conn, 1, 2, 100.0);
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    public static void transferMoney(Connection conn, int fromId, int toId, double amount) {
        try {
            conn.setAutoCommit(false); // Start transaction

            // Deduct from sender
            try (PreparedStatement debit = conn.prepareStatement(
                    "UPDATE accounts SET balance = balance - ? WHERE id = ?")) {
                debit.setDouble(1, amount);
                debit.setInt(2, fromId);
                if (debit.executeUpdate() != 1) throw new SQLException("Debit failed");
            }

            // Add to receiver
            try (PreparedStatement credit = conn.prepareStatement(
                    "UPDATE accounts SET balance = balance + ? WHERE id = ?")) {
                credit.setDouble(1, amount);
                credit.setInt(2, toId);
                if (credit.executeUpdate() != 1) throw new SQLException("Credit failed");
            }

            conn.commit(); // Commit if both succeed
            System.out.println("Transfer successful.");

        } catch (SQLException e) {
            try {
                conn.rollback(); // Rollback on failure
                System.out.println("Transfer failed. Rolled back.");
            } catch (SQLException rollbackEx) {
                System.out.println("Rollback error: " + rollbackEx.getMessage());
            }
        } finally {
            try {
                conn.setAutoCommit(true); // Restore auto-commit
            } catch (SQLException e) {
                System.out.println("Error resetting auto-commit: " + e.getMessage());
            }
        }
    }
}