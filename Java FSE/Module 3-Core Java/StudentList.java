import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("Enter student names (type 'exit' to stop):");
        while (true) {
            name = input.nextLine();
            if (name.equalsIgnoreCase("exit")) break;
            names.add(name);
        }

        System.out.println("Students entered:");
        for (String n : names) {
            System.out.println(n);
        }

        input.close();
    }
}