package Warmup1;

public class monkeyTrouble {

        public static void main(String[] args) {
            // Test cases for the monkeyTrouble function
            System.out.println(monkeyTrouble(true, true));  // true
            System.out.println(monkeyTrouble(false, false));  // true
            System.out.println(monkeyTrouble(true, false));  // false
            System.out.println(monkeyTrouble(false, true));  // false
        }

        public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
            // The simplest and most efficient version
            return (aSmile == bSmile);
    }

}
