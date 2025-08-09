package Warmup2;

public class NoTriples {

    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            // Check if the current element is the same as the next two
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
                return false; // A triple is found
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] test1 = {1, 1, 2, 2, 1};
        int[] test2 = {1, 1, 2, 2, 2, 1};
        int[] test3 = {1, 1, 1, 2, 2, 1};
        int[] test4 = {1, 2, 3, 4, 5};
        int[] test5 = {};                    // (empty array)

        // Print results
        System.out.println("Test 1: " + noTriples(test1));
        System.out.println("Test 2: " + noTriples(test2));
        System.out.println("Test 3: " + noTriples(test3));
        System.out.println("Test 4: " + noTriples(test4));
        System.out.println("Test 5: " + noTriples(test5));
    }
}
