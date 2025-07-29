package Warmup1;

public class sumDouble {

        public static void main(String[] args) {
            // Test cases for the sumDouble function
            System.out.println(sumDouble(1, 2));   // (a and b are different, sum is 1 + 2)
            System.out.println(sumDouble(3, 3));   // (a and b are the same, sum is doubled)
            System.out.println(sumDouble(5, 7));   // (a and b are different, sum is 5 + 7)
            System.out.println(sumDouble(10, 10)); // (a and b are the same, sum is doubled)
            System.out.println(sumDouble(0, 0));   // (a and b are the same, sum is doubled)
        }

        public static int sumDouble(int a, int b) {
            // Add a and b together to get the sum
            int sum = a + b;

            // If a and b are the same, double the sum
            if (a == b) {
                sum = sum * 2;
            }

            // Return the sum (doubled if a and b are the same)
            return sum;
        }
    }
