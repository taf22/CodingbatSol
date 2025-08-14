package Functional2;

import java.util.*;

public class noLong {

    // Method to return a list of strings omitting any string length 4 or more
    public static List<String> noLong(List<String> strings) {
        List<String> result = new ArrayList<>();

        // Loop through each string
        for (String str : strings) {
            // Only add strings with length less than 4
            if (str.length() < 4) {
                result.add(str);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        List<String> input1 = Arrays.asList("this", "not", "too", "long");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + noLong(input1));

        // Example 2
        List<String> input2 = Arrays.asList("a", "bbb", "cccc");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + noLong(input2));

        // Example 3
        List<String> input3 = Arrays.asList("cccc", "cccc", "cccc");
        System.out.println("Input: " + input3);
        System.out.println("Output: " + noLong(input3));
    }
}
