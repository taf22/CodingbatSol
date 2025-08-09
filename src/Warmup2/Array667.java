package Warmup2;

public class Array667 {

    public static int array667(int[] nums) {
        int count = 0;

        // Iterate through the array until the second to last element
        for (int i = 0; i < nums.length - 1; i++) {
            // Check if current element is 6 and next element is either 6 or 7
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Test cases to verify the solution
        int[] test1 = {6, 6, 2};
        int[] test2 = {6, 6, 2, 6};
        int[] test3 = {6, 7, 2, 6};
        int[] test4 = {6, 6, 6};      //(6,6 and 6,6 again)
        int[] test5 = {1, 2, 3};

        System.out.println("Test 1: " + array667(test1));
        System.out.println("Test 2: " + array667(test2));
        System.out.println("Test 3: " + array667(test3));
        System.out.println("Test 4: " + array667(test4));
        System.out.println("Test 5: " + array667(test5));
    }
}
