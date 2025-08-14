package Functional2;

import java.util.*;

public class no34 {

    // Method to return a list of strings omitting those with length 3 or 4
    public static List<String> no34(List<String> strings) {
        List<String> result = new ArrayList<>();

        // Loop through each string
        for (String str : strings) {
            // Add strings whose length is NOT 3 or 4
            if (str.length() != 3 && str.length() != 4) {
                result.add(str);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        List<String> input1 = Arrays.asList("a", "bb", "ccc");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + no34(input1));

        // Example 2
        List<String> input2 = Arrays.asList("a", "bb", "ccc", "dddd");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + no34(input2));

        // Example 3
        List<String> input3 = Arrays.asList("ccc", "dddd", "apple");
        System.out.println("Input: " + input3);
        System.out.println("Output: " + no34(input3));
    }
}
