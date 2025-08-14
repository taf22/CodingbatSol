package Logic1;
public class specialEleven {

    /**
     * Returns true if the number is special.
     * A number is special if:
     * - It is a multiple of 11 (n % 11 == 0)
     * - OR it is one more than a multiple of 11 (n % 11 == 1)
     *
     * @param n the number to check
     * @return true if the number is special, false otherwise
     */
    public static boolean specialEleven(int n) {
        return (n % 11 == 0 || n % 11 == 1);
    }

    public static void main(String[] args) {
        System.out.println("specialEleven(22): " + specialEleven(22));
        System.out.println("specialEleven(23): " + specialEleven(23));
        System.out.println("specialEleven(24): " + specialEleven(24));
        System.out.println("specialEleven(11): " + specialEleven(11));
        System.out.println("specialEleven(12): " + specialEleven(12));
        System.out.println("specialEleven(13): " + specialEleven(13));
    }
}
