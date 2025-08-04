package Warmup2;

public class stringTimes {

    public static String stringTimes(String str, int n) {
        String result = ""; // Initialize an empty result string

        // Append 'str' to result 'n' times using a loop
        for (int i = 0; i < n; i++) {
            result += str;
        }

        return result;
    }

    // Main method for testing the stringTimes method
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));
        System.out.println(stringTimes("Code", 0));
        System.out.println(stringTimes("", 5));
    }
}
