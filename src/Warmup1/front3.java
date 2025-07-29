package Warmup1;

public class front3 {
        public static void main(String[] args) {
            // Test cases for the front3 function
            System.out.println(front3("java"));   // (first 3 characters repeated)
            System.out.println(front3("hi"));     //  (string is shorter than 3, repeated as is)
            System.out.println(front3("a"));      //  (string is shorter than 3, repeated as is)
            System.out.println(front3("hello"));  //  (first 3 characters repeated)
        }

        public static String front3(String str) {
            // Get the first 3 characters of the string (or the whole string if it's shorter than 3)
            String front;

            if (str.length() >= 3) {
                front = str.substring(0, 3);  // If the string is long enough, take the first 3 characters
            }
            else {
                front = str;  // If the string is shorter than 3, use the whole string
            }

            // Repeat the first 3 characters (or the whole string) three times
            return front + front + front;
        }
    }
