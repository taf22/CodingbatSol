package Warmup1;

public class makes10 {

        public static void main(String[] args) {
            // Test cases for the makes10 function
            System.out.println(makes10(10, 5));  // (a is 10)
            System.out.println(makes10(7, 3));   // (a + b equals 10)
            System.out.println(makes10(5, 5));   // (a + b equals 10)
            System.out.println(makes10(8, 4));   // (a + b does not equal 10)
            System.out.println(makes10(4, 6));   // (a + b equals 10)
        }
        public static boolean makes10(int a, int b) {
            // Return true if either a or b is 10, or if the sum of a and b equals 10
            return (a == 10 || b == 10 || a + b == 10);
        }
}
