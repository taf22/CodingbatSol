package Warmup2;

public class stringSplosion {
    public static String stringSplosion(String str) {
        String result = "";

        // Build the result by adding substrings from 0 to i
        for (int i = 1; i <= str.length(); i++) {
            result += str.substring(0, i);
        }

        return result;
    }

    // Main method to test stringSplosion
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));    // Output: CCoCodCode
        System.out.println(stringSplosion("abc"));     // Output: aababc
        System.out.println(stringSplosion("ab"));      // Output: aab
        System.out.println(stringSplosion("x"));       // Output: x
        System.out.println(stringSplosion(""));        // Output: (empty string)
    }
}
