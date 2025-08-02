package Functional1;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RightDigit {

    // Method that returns a list of rightmost digits
    public static List<Integer> rightDigit(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            result.add(num % 10);
        }
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test case 1
        List<Integer> input1 = Arrays.asList(1, 22, 93);
        System.out.println("Input: " + input1);
        System.out.println("Output: " + rightDigit(input1));

        // Test case 2
        List<Integer> input2 = Arrays.asList(16, 8, 886, 8, 1);
        System.out.println("Input: " + input2);
        System.out.println("Output: " + rightDigit(input2));

        // Test case 3
        List<Integer> input3 = Arrays.asList(10, 0);
        System.out.println("Input: " + input3);
        System.out.println("Output: " + rightDigit(input3));
    }
}
