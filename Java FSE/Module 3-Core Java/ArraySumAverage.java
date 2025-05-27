import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Number of elements should be positive.");
        } else {
            int[] numbers = new int[n];

            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = input.nextInt();
            }

            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }

            double average = (double) sum / n;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        }

        input.close();
    }
}