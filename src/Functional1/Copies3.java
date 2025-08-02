package Functional1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Copies3 {

    // Method to return a list where each string is repeated 3 times
    public static List<String> copies3(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            result.add(str + str + str);
        }
        return result;
    }

    // Main method to test the function
    public static void main(String[] args) {

        // Test case 1
        List<String> input1 = Arrays.asList("a", "bb", "ccc");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + copies3(input1));

        // Test case 2
        List<String> input2 = Arrays.asList("24", "a", "");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + copies3(input2));

        // Test case 3
        List<String> input3 = Arrays.asList("hello", "there");
        System.out.println("Input: " + input3);
        System.out.println("Output: " + copies3(input3));
    }
}
