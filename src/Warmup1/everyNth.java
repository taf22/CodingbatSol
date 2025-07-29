package Warmup1;

public class everyNth {

    public static void main(String[] args) {
        // Test cases for the everyNth function
        System.out.println(everyNth("abcdefg", 2));  // "ace"
        System.out.println(everyNth("abcdefg", 3));  // "adg"
        System.out.println(everyNth("Hello", 1));    // "Hello"
        System.out.println(everyNth("abcdefg", 4));  // "ad"
        System.out.println(everyNth("", 3));         // ""
    }

    public static String everyNth(String str, int n) {
        StringBuilder result = new StringBuilder();

        // Look at every nth char
        for (int i = 0; i < str.length(); i = i + n) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }
}

