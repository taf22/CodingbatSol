package Warmup1;

public class max1020 {

        // Method to return the larger number that falls in the 10..20 range
        public static int max1020(int a, int b) {
            // Ensure 'a' holds the larger value for easier checking
            if (b > a) {
                int temp = a;
                a = b;
                b = temp;
            }
            // Since 'a' is larger, check it first
            if (a >= 10 && a <= 20) return a;
            if (b >= 10 && b <= 20) return b;

            // If neither value is in the range, return 0
            return 0;
        }

        // Main method to test the max1020 function
        public static void main(String[] args) {
            System.out.println("Max in range (11, 19): " + max1020(11, 19));
            System.out.println("Max in range (21, 10): " + max1020(21, 10));
            System.out.println("Max in range (9, 21): " + max1020(9, 21));
            System.out.println("Max in range (20, 20): " + max1020(20, 20));
        }
    }

