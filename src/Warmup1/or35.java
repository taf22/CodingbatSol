package Warmup1;

public class or35 {

        public static void main(String[] args) {
            // Test cases for the or35 function
            System.out.println(or35(3));   //  (3 is divisible by 3)
            System.out.println(or35(5));   // (5 is divisible by 5)
            System.out.println(or35(15));  // (15 is divisible by both 3 and 5)
            System.out.println(or35(7));   // (7 is not divisible by either 3 or 5)
            System.out.println(or35(10));  // (10 is divisible by 5)
        }

        public static boolean or35(int n) {
            // Return true if n is divisible by either 3 or 5
            return (n % 3 == 0) || (n % 5 == 0);
        }
    }
