package Functional2;

    import java.util.*;

    public class noZ {

        // Method to return a list of strings omitting any that contain "z"
        public static List<String> noZ(List<String> strings) {
            List<String> result = new ArrayList<>();

            // Iterate over each string in the input list
            for (String str : strings) {
                // Add the string to result if it does NOT contain "z"
                if (!str.contains("z")) {
                    result.add(str);
                }
            }
            return result;
        }

        public static void main(String[] args) {
            // Example 1
            List<String> input1 = Arrays.asList("aaa", "bbb", "aza");
            System.out.println("Input: " + input1);
            System.out.println("Output: " + noZ(input1));

            // Example 2
            List<String> input2 = Arrays.asList("hizr", "hzello", "hi");
            System.out.println("Input: " + input2);
            System.out.println("Output: " + noZ(input2));

            // Example 3
            List<String> input3 = Arrays.asList("hello", "howz", "are", "youz");
            System.out.println("Input: " + input3);
            System.out.println("Output: " + noZ(input3));
        }
    }


