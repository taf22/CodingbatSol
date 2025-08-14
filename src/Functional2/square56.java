package Functional2;

import java.util.*;

public class square56 {
    public static List<Integer> square56(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();

        // Loop through each number
        for (int num : nums) {
            int transformed = num * num + 10;

            // Add to result if it does NOT end in 5 or 6
            int lastDigit = transformed % 10;
            if (lastDigit != 5 && lastDigit != 6) {
                result.add(transformed);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        // Example 1
        List<Integer> input1 = Arrays.asList(3, 1, 4);
        System.out.println("Input: " + input1);
        System.out.println("Output: " + square56(input1));

        // Example 2
        List<Integer> input2 = Arrays.asList(1);
        System.out.println("Input: " + input2);
        System.out.println("Output: " + square56(input2));

        // Example 3
        List<Integer> input3 = Arrays.asList(2);
        System.out.println("Input: " + input3);
        System.out.println("Output: " + square56(input3));
    }
}
