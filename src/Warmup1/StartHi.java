package Warmup1;

public class StartHi {
    // Method to check if the string starts with "hi"
    public static boolean startHi(String str) {
        // Check if the string has at least 2 characters
        if (str.length() < 2) {
            return false;
        }

        // Get the first two characters of the string
        String firstTwo = str.substring(0, 2);

        // Check if the first two characters are "hi"
        if (firstTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(startHi("hi there"));  // true
        System.out.println(startHi("hi"));        // true
        System.out.println(startHi("hello"));     // false
        System.out.println(startHi("he"));        // false
    }
}

