package Warmup2;
public class arrayCount9 {

    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // Test cases
        int[] test1 = {1, 2, 9};
        int[] test2 = {1, 9, 9};
        int[] test3 = {1, 9, 9, 3, 9};
        int[] test4 = {};
        // Output results
        System.out.println("Count of 9s in test1: " + arrayCount9(test1));
        System.out.println("Count of 9s in test2: " + arrayCount9(test2));
        System.out.println("Count of 9s in test3: " + arrayCount9(test3));
        System.out.println("Count of 9s in test4: " + arrayCount9(test4));
    }
}
