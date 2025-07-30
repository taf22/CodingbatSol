package String1;

public class nonStart {
    // This program defines a method that removes the first character from two strings
// and then joins them together.
        // This method takes two strings and returns their concatenation,
        // excluding the first character of each string.
        public static String nonStart(String a, String b) {
            // Get substring of each string starting from index 1 (skipping the first character)
            String partA = a.substring(1);
            String partB = b.substring(1);
            // Combine both parts and return the result
            return partA + partB;
        }
        // Main method to test the nonStart method with sample inputs
        public static void main(String[] args) {
            System.out.println(nonStart("Hello", "There")); // Output: ellohere
            System.out.println(nonStart("java", "code"));   // Output: avaode
            System.out.println(nonStart("shotl", "java"));  // Output: hotlava
        }
    }

