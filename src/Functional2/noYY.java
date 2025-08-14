package Functional2;

import java.util.*;

public class noYY {

    public static List<String> noYY(List<String> strings) {
        List<String> result = new ArrayList<>();

        // Loop through each string
        for (String str : strings) {
            String modified = str + "y";

            // Add only if the resulting string does NOT contain "yy"
            if (!modified.contains("yy")) {
                result.add(modified);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        List<String> input1 = Arrays.asList("a", "b", "c");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + noYY(input1));

        // Example 2
        List<String> input2 = Arrays.asList("a", "b", "cy");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + noYY(input2));

        // Example 3
        List<String> input3 = Arrays.asList("xx", "ya", "zz");
        System.out.println("Input: " + input3);
        System.out.println("Output: " + noYY(input3));
    }
}
