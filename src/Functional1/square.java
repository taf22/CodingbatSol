package Functional1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class square {

    // Method to return a list where each integer is squared
    public static List<Integer> square(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            result.add(num * num);
        }
        return result;
    }

    // Main method to test the square function
    public static void main(String[] args) {

        // Test case 1
        List<Integer> input1 = Arrays.asList(1, 2, 3);
        System.out.println("Input: " + input1);
        System.out.println("Squared: " + square(input1));

        // Test case 2
        List<Integer> input2 = Arrays.asList(6, 8, -6, -8, 1);
        System.out.println("Input: " + input2);
        System.out.println("Squared: " + square(input2));

        // Test case 3
        List<Integer> input3 = new ArrayList<>();
        System.out.println("Input: " + input3);
        System.out.println("Squared: " + square(input3));
    }
}
