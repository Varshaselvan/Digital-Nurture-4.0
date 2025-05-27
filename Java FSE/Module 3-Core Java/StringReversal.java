import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = input.nextLine();

        // Method 1: Using StringBuilder
        String reversed = new StringBuilder(original).reverse().toString();

        // Alternatively, you can reverse using a loop:
        /*
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        */

        System.out.println("Reversed string: " + reversed);

        input.close();
    }
}