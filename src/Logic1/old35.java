package Logic1;
public class old35 {

    /**
     * Returns true if the number is a multiple of 3 or 5, but not both.
     *
     * For example:
     * - 3 is a multiple of 3 → true
     * - 10 is a multiple of 5 → true
     * - 15 is a multiple of both 3 and 5 → false
     *
     * @param n the number to check
     * @return true if it's divisible by 3 or 5 (but not both)
     */
    public static boolean old35(int n) {
        // Check if n is a multiple of 3
        boolean isMultipleOf3 = (n % 3 == 0);
        // Check if n is a multiple of 5
        boolean isMultipleOf5 = (n % 5 == 0);

        // Return true only if one of them is true, but not both (XOR logic)
        return isMultipleOf3 ^ isMultipleOf5;
    }

    public static void main(String[] args) {
        System.out.println("old35(3): " + old35(3));
        System.out.println("old35(10): " + old35(10));
        System.out.println("old35(15): " + old35(15));
        System.out.println("old35(9): " + old35(9));
        System.out.println("old35(5): " + old35(5));
        System.out.println("old35(30): " + old35(30));
    }
}

