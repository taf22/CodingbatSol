package String1;

public class firstHalf {

    // This program returns the first half of a given string with even length.
        // This method returns the first half of the string
        public static String firstHalf(String str) {
            // Find the middle index (since the string length is even)
            int halfLength = str.length() / 2;
            // Return the substring from index 0 to halfLength (not including halfLength)
            return str.substring(0, halfLength);
        }
        // Main method to test the firstHalf method
        public static void main(String[] args) {
            // Test cases
            System.out.println(firstHalf("WooHoo"));
            System.out.println(firstHalf("HelloThere"));
            System.out.println(firstHalf("abcdef"));     
        }
    }


