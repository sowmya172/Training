class UtilityMethods {

    // 1. Utility method to add two numbers
    static int add(int a, int b) {
        return a + b;
    }

    // 2. Utility method to find square of a number
    static int square(int n) {
        return n * n;
    }

    // 3. Utility method to check even or odd
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 4. Utility method to find maximum of two numbers
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // 5. Utility method to print a message
    static void printMessage() {
        System.out.println("Welcome to Java Utility Methods Program");
    }

    public static void main(String[] args) {

        printMessage();

        System.out.println("Addition: " + add(10, 20));
        System.out.println("Square: " + square(5));
        System.out.println("Is Even: " + isEven(8));
        System.out.println("Maximum: " + max(15, 25));
    }
}