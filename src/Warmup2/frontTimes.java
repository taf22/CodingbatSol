package Warmup2;

public class frontTimes {
    public static String frontTimes(String str, int n) {
        String front = str.length() < 3 ? str : str.substring(0, 3);

        String result = ""; // Initialize the result string

        for (int i = 0; i < n; i++) {
            result += front;
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
        System.out.println(frontTimes("Hi", 4));
        System.out.println(frontTimes("", 3));
    }
}
