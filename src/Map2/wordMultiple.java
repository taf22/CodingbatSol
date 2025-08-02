package Map2;

import java.util.HashMap;
import java.util.Map;

public class wordMultiple {

    // This method returns a map where the key is the word and the value is true
    // if that word appears two or more times in the array.
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Boolean> resultMap = new HashMap<>();

        // Count the number of times each word appears
        for (String word : strings) {
            // Update the count for each word
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        // Build the result map where value is true if count is 2 or more
        for (String word : countMap.keySet()) {
            resultMap.put(word, countMap.get(word) >= 2);
        }

        return resultMap;
    }

    // Main method for testing the function
    public static void main(String[] args) {
        // Test Case 1
        String[] input1 = {"a", "b", "a", "c", "b"};
        System.out.println("Test 1 Output: " + wordMultiple(input1));
        // Expected: {a=true, b=true, c=false}

        // Test Case 2
        String[] input2 = {"c", "b", "a"};
        System.out.println("Test 2 Output: " + wordMultiple(input2));
        // Expected: {a=false, b=false, c=false}

        // Test Case 3
        String[] input3 = {"c", "c", "c", "c"};
        System.out.println("Test 3 Output: " + wordMultiple(input3));
        // Expected: {c=true}

        // Test Case 4 - empty input
        String[] input4 = {};
        System.out.println("Test 4 Output: " + wordMultiple(input4));
        // Expected: {}
    }
}
