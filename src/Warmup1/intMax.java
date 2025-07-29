package Warmup1;

public class intMax {

    // This program defines a method to find the largest of three integers.
// It compares the values step by step to determine the maximum.

        // Method to find the maximum of three integers
        public static int intMax(int a, int b, int c) {
            int max;

            // First compare a and b
            if (a > b) {
                max = a;
            } else {
                max = b;
            }
            // Now compare the current max with c
            if (c > max) {
                max = c;
            }
            return max;
            // Note: This could be simplified using Math.max(),
            // like Math.max(a, Math.max(b, c))
        }
        // Main method to test intMax
        public static void main(String[] args) {
            System.out.println("Max of (3, 7, 5): " + intMax(3, 7, 5));
            System.out.println("Max of (9, 2, 8): " + intMax(9, 2, 8));
            System.out.println("Max of (4, 4, 4): " + intMax(4, 4, 4));
        }
    }

