package Functional1;


import java.util.*;
        import java.util.stream.Collectors;

public class lower {


    public static List<String> lower(List<String> strings) {
        return strings.stream()
                .map(String::toLowerCase) // Convert each string to lowercase
                .collect(Collectors.toList()); // Collect results into a List
    }

    // Main method to test the lower method
    public static void main(String[] args) {
        // Test case 1
        List<String> input1 = Arrays.asList("Hello", "Hi");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + lower(input1));

        // Test case 2
        List<String> input2 = Arrays.asList("AAA", "BBB", "ccc");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + lower(input2));

        // Test case 3
        List<String> input3 = Arrays.asList("KitteN", "ChocolaTE");
        System.out.println("Input: " + input3);
        System.out.println("Output: " + lower(input3));
    }
}
