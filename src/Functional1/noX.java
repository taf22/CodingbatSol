package Functional1;

import java.util.*;
import java.util.stream.Collectors;
public class noX {

    public static List<String> noX(List<String> strings) {
        return strings.stream()
                .map(s -> s.replace("x", "")) // Remove all 'x' from the string
                .collect(Collectors.toList()); // Collect the result as a List
    }

    // Main method for testing the noX function
    public static void main(String[] args) {
        // Example 1
        List<String> input1 = Arrays.asList("ax", "bb", "cx");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + noX(input1));

        // Example 2
        List<String> input2 = Arrays.asList("xxax", "xbxbx", "xxcx");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + noX(input2));

        // Example 3
        List<String> input3 = Arrays.asList("x");
        System.out.println("Input: " + input3);
        System.out.println("Output: " + noX(input3));
    }
}
