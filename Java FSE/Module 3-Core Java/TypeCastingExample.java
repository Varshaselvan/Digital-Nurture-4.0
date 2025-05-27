public class TypeCastingExample {
    public static void main(String[] args) {
        // Double to int (explicit casting)
        double decimalValue = 9.75;
        int intValue = (int) decimalValue;  // Decimal part is truncated

        // Int to double (implicit casting)
        int wholeNumber = 42;
        double convertedDouble = wholeNumber;

        System.out.println("Original double: " + decimalValue);
        System.out.println("After casting to int: " + intValue);

        System.out.println("Original int: " + wholeNumber);
        System.out.println("After casting to double: " + convertedDouble);
    }
}