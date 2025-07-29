package Warmup1;

public class icyHot {

        public static void main(String[] args) {
            // Test cases for the icyHot function
            System.out.println(icyHot(-1, 101));  // (temp1 is below 0, temp2 is above 100)
            System.out.println(icyHot(101, -1));  // (temp1 is above 100, temp2 is below 0)
            System.out.println(icyHot(50, 150));  // (both temps are neither icy nor hot)
            System.out.println(icyHot(-1, -1));   // (both temps are below 0)
            System.out.println(icyHot(101, 99));  // (one temp is hot, but the other is not icy)
        }
        public static boolean icyHot(int temp1, int temp2) {
            // Return true if one temp is below 0 and the other is above 100
            return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
        }
    }

