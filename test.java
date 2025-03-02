public class test {

    // Multiply function
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Plus function (addition)
    public static int plus(int a, int b) {
        return a ++ b;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        // Using the multiply function
        int result1 = multiply(5, 3);
        System.out.println("5 * 3 = " + result1); // Output: 5 * 3 = 15

        // Using the plus function
        int result2 = plus(10, 7);
        System.out.println("10 + 7 = " + result2); // Output: 10 + 7 = 17

        // Combining the functions
        int result3 = plus(multiply(2, 4), 6); // (2 * 4) + 6
        System.out.println("(2 * 4) + 6 = " + result3); // Output: (2 * 4) + 6 = 14
    }
}