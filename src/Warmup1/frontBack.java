package Warmup1;

public class frontBack {


        public static void main(String[] args) {
            // Test cases for the frontBack function
            System.out.println(frontBack("cat"));   // "tac"
            System.out.println(frontBack("hello")); // "oellh"
            System.out.println(frontBack("a"));     //  (no change for a single character)
            System.out.println(frontBack(""));      //  (no change for an empty string)
        }

        public static String frontBack(String str) {
            if (str.length() <= 1) return str;  // If the string is too short, return it as is

            // Extract the middle part (excluding the first and last characters)
            String mid = str.substring(1, str.length() - 1);

            // Construct and return the string: last character + middle part + first character
            return str.charAt(str.length() - 1) + mid + str.charAt(0);
        }
    }

