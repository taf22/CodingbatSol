package Functional1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AddStar {

    // Method to add "*" to the end of each string
    public static List<String> addStar(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            result.add(str + "*");
        }
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {

        // Test case 1
        List<String> input1 = Arrays.asList("a", "bb", "ccc");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + addStar(input1));

        // Test case 2
        List<String> input2 = Arrays.asList("hello", "there");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + addStar(input2));

        // Test case 3
        List<String> input3 = Arrays.asList("*");
        System.out.println("Input: " + input3);
        System.out.println("Output: " + addStar(input3));

        // Test case 4 - empty list
        List<String> input4 = new ArrayList<>();
        System.out.println("Input: " + input4);
        System.out.println("Output: " + addStar(input4));
    }
}
