package Functional1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class moreY {

    // Method to return a list where each string is wrapped with "y"
    public static List<String> moreY(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            result.add("y" + str + "y");
        }
        return result;
    }

    // Main method to test the moreY function
    public static void main(String[] args) {

        // Test case 1
        List<String> input1 = Arrays.asList("a", "b", "c");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + moreY(input1));

        // Test case 2
        List<String> input2 = Arrays.asList("hello", "there");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + moreY(input2));

        // Test case 3
        List<String> input3 = Arrays.asList("yay");
        System.out.println("Input: " + input3);
        System.out.println("Output: " + moreY(input3));
    }
}
