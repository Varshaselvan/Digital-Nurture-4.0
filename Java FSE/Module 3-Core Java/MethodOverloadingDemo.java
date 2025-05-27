public class MethodOverloadingDemo {

    // Adds two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Adds two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Adds three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int sum1 = add(5, 10);           // Calls add(int, int)
        double sum2 = add(5.5, 10.2);   // Calls add(double, double)
        int sum3 = add(1, 2, 3);        // Calls add(int, int, int)

        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of two doubles: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
    }
}