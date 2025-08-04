package Warmup2;
public class ArrayFront9 {

    public static boolean arrayFront9(int[] nums) {
        int len = Math.min(nums.length, 4); // Check up to the first 4 elements
        for (int i = 0; i < len; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {1, 2, 9, 3, 4};
        int[] test2 = {1, 2, 3, 4, 9};
        int[] test3 = {1, 2, 3, 4, 5};
        int[] test4 = {9, 1};
        int[] test5 = {1};
        int[] test6 = {};

        // Print results
        System.out.println(arrayFront9(test1));
        System.out.println(arrayFront9(test2));
        System.out.println(arrayFront9(test3));
        System.out.println(arrayFront9(test4));
        System.out.println(arrayFront9(test5));
        System.out.println(arrayFront9(test6));
    }
}
