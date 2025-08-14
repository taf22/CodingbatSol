package Logic1;

public class in1To10 {

    /**
     * Checks if the number 'n' is in the range 1 to 10 based on the 'outsideMode'.
     *
     * @param n           the number to check
     * @param outsideMode whether we are in outsideMode or not
     * @return true if the number meets the criteria, false otherwise
     */
    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            // If outsideMode is true, return true when n <= 1 or n >= 10
            return (n <= 1 || n >= 10);
        } else {
            // If outsideMode is false, return true when n is between 1 and 10 inclusive
            return (n >= 1 && n <= 10);
        }
    }

    public static void main(String[] args) {
        System.out.println("in1To10(5, false): " + in1To10(5, false));
        System.out.println("in1To10(11, false): " + in1To10(11, false));
        System.out.println("in1To10(11, true): " + in1To10(11, true));
        System.out.println("in1To10(1, true): " + in1To10(1, true));
        System.out.println("in1To10(1, false): " + in1To10(1, false));
        System.out.println("in1To10(0, true): " + in1To10(0, true));
        System.out.println("in1To10(0, false): " + in1To10(0, false));
    }
}

