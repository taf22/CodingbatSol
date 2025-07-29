package Warmup1;

public class posNeg {


        public static void main(String[] args) {
            // Test cases for the posNeg function
            System.out.println(posNeg(1, -1, false));   //  (one is positive, the other is negative)
            System.out.println(posNeg(-1, 1, false));   //  (one is negative, the other is positive)
            System.out.println(posNeg(1, 1, false));    //  (both are positive)
            System.out.println(posNeg(-1, -1, true));   //  (both are negative)
            System.out.println(posNeg(-1, 1, true));    //  (not both negative)
        }

        public static boolean posNeg(int a, int b, boolean negative) {
            if (negative) {
                // If 'negative' is true, check if both numbers are negative
                return (a < 0 && b < 0);
            } else {
                // If 'negative' is false, check if numbers have opposite signs
                return ((a < 0 && b > 0) || (a > 0 && b < 0));
            }
        }
}
