package Warmup1;

public class delDel {

        public static void main(String[] args) {
            // Test cases for the delDel function
            System.out.println(delDel("adelcat"));   // "acat" (removes "del" after the first character)
            System.out.println(delDel("abdelcat"));  // "abdelcat" (doesn't remove anything, since "del" is not at index 1)
            System.out.println(delDel("xxdelcat"));  // "xxcat" (removes "del" after the first character)
            System.out.println(delDel("abcdef"));    // "abcdef" (no "del" at the right position)
            System.out.println(delDel("delcat"));    // "cat" (removes "del" after the first character)
        }

        public static String delDel(String str) {
            // If the string has at least 4 characters and "del" starts at index 1, remove it
            if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
                // Return the first character + the rest of the string starting from index 4
                return str.substring(0, 1) + str.substring(4);
            }

            // If "del" is not found at index 1, return the original string
            return str;
        }
    }

