package Warmup2;

public class Array123 {
    public static boolean array123(int[] nums) {
        // Loop through the array, stopping 2 elements before the end
        // Check if current element is 1, next is 2, and the one after that is 3
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 1, 2, 3, 1};
        int[] test2 = {1, 1, 2, 4, 1};
        int[] test3 = {1, 1, 2, 1, 2, 3};

        System.out.println(array123(test1)); // true
        System.out.println(array123(test2)); // false
        System.out.println(array123(test3)); // true
    }
}
