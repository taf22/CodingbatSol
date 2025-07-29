package Warmup1;

public class in3050 {

        public static void main(String[] args) {
            // Test cases for the in3050 function
            System.out.println(in3050(30, 31)); // (both are between 30 and 40)
            System.out.println(in3050(40, 50)); // (both are between 40 and 50)
            System.out.println(in3050(25, 35)); // (one is not in range)
            System.out.println(in3050(40, 45)); // (both are between 40 and 50)
            System.out.println(in3050(33, 41)); // (one is between 30 and 40, the other between 40 and 50)
        }
        public static boolean in3050(int a, int b) {
            // Check if both numbers are in the range 30-40 or both are in the range 40-50
            return ((a >= 30 && a <= 40 && b >= 30 && b <= 40) || (a >= 40 && a <= 50 && b >= 40 && b <= 50));
        }
    }
