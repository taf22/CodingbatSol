package Functional2;

import java.util.*;

public class two2 {
    public static List<Integer> two2(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();

        // Loop through each number
        for (int num : nums) {
            int doubled = num * 2;

            // Add to result if it does NOT end with 2
            if (doubled % 10 != 2) {
                result.add(doubled);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        // Example 1
        List<Integer> input1 = Arrays.asList(1, 2, 3);
        System.out.println("Input: " + input1);
        System.out.println("Output: " + two2(input1));

        // Example 2
        List<Integer> input2 = Arrays.asList(2, 6, 11);
        System.out.println("Input: " + input2);
        System.out.println("Output: " + two2(input2));

        // Example 3
        List<Integer> input3 = Arrays.asList(0);
        System.out.println("Input: " + input3);
        System.out.println("Output: " + two2(input3));
    }
}

