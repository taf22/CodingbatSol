package String1;

public class middleThree {


        // Method to return string length 3 from the middle of an odd length string
        public static String middleThree(String str) {
            int mid = str.length() / 2;  // Middle index
            // Return substring of length 3 centered at mid
            return str.substring(mid - 1, mid + 2);
        }
        // Main method to test middleThree
        public static void main(String[] args) {
            System.out.println(middleThree("Candy"));
            System.out.println(middleThree("and"));
            System.out.println(middleThree("solving"));
        }
    }

