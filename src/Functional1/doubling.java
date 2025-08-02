package Functional1;

import java.util.*;

public class doubling {

    // Method that takes a list of integers and returns a new list with each element doubled
    public static List<Integer> doubling(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();

        // Loop through the list and multiply each number by 2
        for (Integer num : nums) {
            result.add(num * 2);
        }

        return result;
    }

    // Main method to test the doubling function
    public static void main(String[] args) {
        // Test case 1
        List<Integer> input1 = Arrays.asList(1, 2, 3);
        System.out.println("Input: " + input1);
        System.out.println("Output: " + doubling(input1));

        // Test case 2
        List<Integer> input2 = Arrays.asList(6, 8, 6, 8, -1);
        System.out.println("Input: " + input2);
        System.out.println("Output: " + doubling(input2));

        // Test case 3 (empty list)
        List<Integer> input3 = new ArrayList<>();
        System.out.println("Input: " + input3);
        System.out.println("Output: " + doubling(input3)); // []
    }
}
