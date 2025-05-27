import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter student ID and name (type -1 to stop):");
        while (true) {
            System.out.print("ID: ");
            int id = input.nextInt();
            if (id == -1) break;
            input.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = input.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("Enter ID to retrieve name: ");
        int searchId = input.nextInt();
        String result = studentMap.get(searchId);
        if (result != null) {
            System.out.println("Name: " + result);
        } else {
            System.out.println("No student found with ID " + searchId);
        }

        input.close();
    }
}