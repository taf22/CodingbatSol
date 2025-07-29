package Warmup1;

public class lastDigit {


        public static void main(String[] args) {
            // Test cases for the lastDigit function
            System.out.println(lastDigit(123, 23));   // (both have last digit 3)
            System.out.println(lastDigit(123, 45));   // (last digits are different)
            System.out.println(lastDigit(10, 20));    // (both have last digit 0)
            System.out.println(lastDigit(7, 17));     // (both have last digit 7)
            System.out.println(lastDigit(123, 789));  // (last digits are different)
        }
        public static boolean lastDigit(int a, int b) {
            // Check if the last digits of both numbers are the same
            return (a % 10 == b % 10);
        }
    }

