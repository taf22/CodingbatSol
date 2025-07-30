package String1;

public class theEnd {
        // Method to return a string length 1 from front or back based on 'front' boolean
        public static String theEnd(String str, boolean front) {
            if (front) {
                // Return first character
                return str.substring(0, 1);
            } else {
                // Return last character
                return str.substring(str.length() - 1);
            }
        }
        // Main method to test theEnd method
        public static void main(String[] args) {
            System.out.println(theEnd("Hello", true));   // Output: "H"
            System.out.println(theEnd("Hello", false));  // Output: "o"
            System.out.println(theEnd("oh", true));      // Output: "o"
        }
    }


