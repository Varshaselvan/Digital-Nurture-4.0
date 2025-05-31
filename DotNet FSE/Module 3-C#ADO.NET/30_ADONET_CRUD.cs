using System;
using System.Data.SqlClient;

class Program
{
    static void Main()
    {
        string connStr = "Server=localhost;Database=TestDB;Trusted_Connection=True;";
        using var conn = new SqlConnection(connStr);
        conn.Open();

        var insertCmd = new SqlCommand("INSERT INTO Employees (Name) VALUES ('John')", conn);
        insertCmd.ExecuteNonQuery();

        var selectCmd = new SqlCommand("SELECT * FROM Employees", conn);
        var reader = selectCmd.ExecuteReader();
        while (reader.Read())
        {
            Console.WriteLine($"ID: {reader[0]}, Name: {reader[1]}");
        }
        reader.Close();

        var updateCmd = new SqlCommand("UPDATE Employees SET Name = 'Jane' WHERE Name = 'John'", conn);
        updateCmd.ExecuteNonQuery();

        var deleteCmd = new SqlCommand("DELETE FROM Employees WHERE Name = 'Jane'", conn);
        deleteCmd.ExecuteNonQuery();
    }
}
