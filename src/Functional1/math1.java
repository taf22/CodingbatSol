package Functional1;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class math1 {

    // Method to apply (num + 1) * 10 for each element
    public static List<Integer> math1(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            result.add((num + 1) * 10);
        }
        return result;
    }

    public static void main(String[] args) {
        // Test case 1
        List<Integer> input1 = Arrays.asList(1, 2, 3);
        System.out.println("Input: " + input1);
        System.out.println("Output: " + math1(input1));

        // Test case 2
        List<Integer> input2 = Arrays.asList(6, 8, 6, 8, 1);
        System.out.println("Input: " + input2);
        System.out.println("Output: " + math1(input2));

        // Test case 3
        List<Integer> input3 = Arrays.asList(10);
        System.out.println("Input: " + input3);
        System.out.println("Output: " + math1(input3));
    }
}
