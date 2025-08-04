package Warmup2;

public class StringMatch {


     // Returns the number of positions where two-character substrings
      //in strings a and b match exactly.
     // @param a First input string
     //@param b Second input string
     //@return Count of matching two-character substrings at the same position
    public static int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;

        // Loop through both strings up to the second-to-last character
        for (int i = 0; i < len - 1; i++) {
            String subA = a.substring(i, i + 2);
            String subB = b.substring(i, i + 2);

            // If both substrings are equal, increment the count
            if (subA.equals(subB)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Sample test cases
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }
}
