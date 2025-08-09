package Warmup2;

public class Has271 {

    public static boolean has271(int[] nums) {
        // Loop through the array, stopping 2 elements before the end
        for (int i = 0; i < nums.length - 2; i++) {
            int val = nums[i];

            // Check for pattern: val, val+5, val-1 (with ±2 tolerance)
            if (nums[i + 1] == val + 5 && Math.abs(nums[i + 2] - (val - 1)) <= 2) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 7, 1};
        int[] test2 = {1, 2, 8, 1};
        int[] test3 = {2, 7, 1};
        int[] test4 = {10, 15, 9};
        int[] test5 = {5, 10, 3};   // (5+5 = 10, 5-1 = 4, and 3 is within ±2 of 4)

        // Output results
        System.out.println("Test 1: " + has271(test1));
        System.out.println("Test 2: " + has271(test2));
        System.out.println("Test 3: " + has271(test3));
        System.out.println("Test 4: " + has271(test4));
        System.out.println("Test 5: " + has271(test5));
    }
}

