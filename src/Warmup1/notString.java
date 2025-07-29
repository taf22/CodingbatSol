package Warmup1;

public class notString {

        public static void main(String[] args) {
            // Test cases for the notString function
            System.out.println(notString("noteworthy"));  // (already starts with "not")
            System.out.println(notString("hello"));       // (doesn't start with "not")
            System.out.println(notString("not"));         // (already starts with "not")
            System.out.println(notString(""));            // (empty string, returns "not ")
        }

        public static String notString(String str) {
            // If the string starts with "not", return it as is
            if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
                return str;
            }

            // Otherwise, add "not " at the beginning of the string
            return "not " + str;
        }
    }

