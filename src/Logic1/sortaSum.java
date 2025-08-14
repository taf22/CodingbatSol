package Logic1;

public class sortaSum {

    //return sum or 20 if the sum is in the "forbidden" range
    public static int sortaSum(int a, int b) {
        int sum = a + b;

        // If the sum is between 10 and 19 (inclusive), return 20
        if (sum >= 10 && sum <= 19) {
            return 20;
        }

        // Otherwise return the actual sum
        return sum;
    }

    //test the sortaSum logic
    public static void main(String[] args) {
        System.out.println("sortaSum(3, 4) → " + sortaSum(3, 4));
        System.out.println("sortaSum(9, 4) → " + sortaSum(9, 4));
        System.out.println("sortaSum(10, 11) → " + sortaSum(10, 11));
    }
}
