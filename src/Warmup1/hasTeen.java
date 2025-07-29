package Warmup1;

public class hasTeen{

    // Method to check if any of the numbers is a teen (13 to 19 inclusive)
    public static boolean hasTeen(int a, int b, int c) {
        // Check if 'a' is in the teen range
        if (a >= 13 && a <= 19) {
            return true;
        }

        // Check if 'b' is in the teen range
        if (b >= 13 && b <= 19) {
            return true;
        }

        // Check if 'c' is in the teen range
        if (c >= 13 && c <= 19) {
            return true;
        }

        // If none are teens, return false
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(hasTeen(13, 20, 10)); // true
        System.out.println(hasTeen(22, 23, 34)); // false
        System.out.println(hasTeen(12, 13, 19)); // true
        System.out.println(hasTeen(10, 11, 12)); // false
    }
}

