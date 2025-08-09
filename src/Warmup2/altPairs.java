package Warmup2;

public class altPairs {

    public static String altPairs(String str) {
        StringBuilder result = new StringBuilder();

        // Loop through the string in steps of 4
        for (int i = 0; i < str.length(); i += 4) {
            // Add the character at position i
            result.append(str.charAt(i));

            // If the next character exists, add that too
            if (i + 1 < str.length()) {
                result.append(str.charAt(i + 1));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
        System.out.println(altPairs(""));
        System.out.println(altPairs("a"));
        System.out.println(altPairs("ab"));
        System.out.println(altPairs("abcdefg"));
    }
}

