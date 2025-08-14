package Logic1;

public class less20 {

    /**
     * Return true if the given non-negative number is 1 or 2 less than
     * a multiple of 20. For example:
     * - 18 → true (20 - 2)
     * - 19 → true (20 - 1)
     * - 20 → false (exactly a multiple of 20)
     *
     * @param n the number to check
     * @return true if n is 1 or 2 less than a multiple of 20
     */
    public static boolean less20(int n) {
        // Get the remainder when divided by 20
        int remainder = n % 20;

        // Check if remainder is 18 or 19 (1 or 2 less than a multiple of 20)
        return remainder == 18 || remainder == 19;
    }

    public static void main(String[] args) {
        System.out.println("less20(18): " + less20(18));
        System.out.println("less20(19): " + less20(19));
        System.out.println("less20(20): " + less20(20));
        System.out.println("less20(38): " + less20(38));
        System.out.println("less20(39): " + less20(39));
        System.out.println("less20(40): " + less20(40));
    }
}

