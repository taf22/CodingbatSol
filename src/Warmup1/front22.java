package Warmup1;

public class front22 {
        public static void main(String[] args) {
            // Test cases for the front22 function
            System.out.println(front22("hello"));  // (first 2 characters added to both ends)
            System.out.println(front22("hi"));     // (string is too short, so it repeats the entire string)
            System.out.println(front22("a"));      // (string is too short, so it repeats the entire string)
            System.out.println(front22("abcd"));   // (first 2 characters added to both ends)
        }

        public static String front22(String str) {
            // Determine how many characters to take from the start of the string
            int take = 2;

            // If the string is shorter than 2 characters, take the entire string
            if (take > str.length()) {
                take = str.length();
            }

            // Get the first 'take' characters from the string
            String front = str.substring(0, take);

            // Return the string with the 'front' added to both ends
            return front + str + front;
        }
    }
