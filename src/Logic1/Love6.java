package Logic1;

public class Love6 {

    // check love for 6
    public static boolean love6(int a, int b) {
        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
    }

    // Testing the function with different cases
    public static void main(String[] args) {
        System.out.println("love6(6, 4) → " + love6(6, 4));
        System.out.println("love6(4, 5) → " + love6(4, 5));
        System.out.println("love6(1, 5) → " + love6(1, 5));
        System.out.println("love6(2, 8) → " + love6(2, 8));
        System.out.println("love6(12, 6) → " + love6(12, 6));
    }
}
