package Warmup1;

public class in1020 {
        public static void main(String[] args) {
            // Test cases for the in1020 function
            System.out.println(in1020(5, 15));   // (b is between 10 and 20)
            System.out.println(in1020(25, 30));  // (neither is between 10 and 20)
            System.out.println(in1020(12, 18));  // (both are between 10 and 20)
            System.out.println(in1020(10, 20));  // (both are on the boundaries of the range)
            System.out.println(in1020(8, 9));    // (neither is in the range 10-20)
        }

        public static boolean in1020(int a, int b) {
            // Check if either a or b is between 10 and 20, inclusive
            return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
        }
    }

