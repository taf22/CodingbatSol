package Warmup1;

public class close10 {

    public static void main(String[] args) {
        // Test cases for the close10 function
        System.out.println(close10(8, 13)); // 8
        System.out.println(close10(13, 8)); // 8
        System.out.println(close10(12, 13)); // 0
        System.out.println(close10(7, 7));  // 7
    }

    public static int close10(int a, int b) {
        // Find the absolute difference between a and 10
        int aDiff = Math.abs(a - 10);
        // Find the absolute difference between b and 10
        int bDiff = Math.abs(b - 10);

        // If a is closer to 10, return a
        if (aDiff < bDiff) {
            return a;
        }

        // If b is closer to 10, return b
        if (bDiff < aDiff) {
            return b;
        }

        // If both are equally close to 10, return 0
        return 0;
    }
}
