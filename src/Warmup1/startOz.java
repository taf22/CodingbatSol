package Warmup1;

public class startOz {

        public static void main(String[] args) {
            // Test cases for the startOz function
            System.out.println(startOz("ozzy"));  // "oz"
            System.out.println(startOz("zoo"));   // "o"
            System.out.println(startOz("abc"));   // ""
            System.out.println(startOz("ocean")); // "o"
            System.out.println(startOz("zebra")); // "z"
        }

        public static String startOz(String str) {
            String result = "";

            // If the string starts with 'o', add it to the result
            if (str.length() >= 1 && str.charAt(0) == 'o') {
                result = result + str.charAt(0);
            }

            // If the second character is 'z', add it to the result
            if (str.length() >= 2 && str.charAt(1) == 'z') {
                result = result + str.charAt(1);
            }

            // Return the final result string (either "o", "z", or "oz")
            return result;
        }
}
