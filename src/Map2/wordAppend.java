package Map2;

import java.util.HashMap;
import java.util.Map;

public class wordAppend {

    // This method returns a string that appends each word every time it appears an even number of times.
    public static String wordAppend(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>(); // To count occurrences
        StringBuilder result = new StringBuilder(); // To build the final result string

        // Loop through each word in the input array
        for (String word : strings) {
            // Get the current count or default to 0 if it's not in the map yet
            int count = countMap.getOrDefault(word, 0);
            countMap.put(word, count + 1); // Update the count

            // If the word has appeared an even number of times, append it to the result
            if ((count + 1) % 2 == 0) {
                result.append(word);
            }
        }

        // Return the built string
        return result.toString();
    }

    // Main method to test the wordAppend logic
    public static void main(String[] args) {
        // Test Case 1
        String[] input1 = {"a", "b", "a"};
        System.out.println("Test 1 Output: " + wordAppend(input1));
        // Expected: "a"

        // Test Case 2
        String[] input2 = {"a", "b", "a", "c", "a", "d", "a"};
        System.out.println("Test 2 Output: " + wordAppend(input2));
        // Expected: "aa"

        // Test Case 3
        String[] input3 = {"a", "", "a"};
        System.out.println("Test 3 Output: " + wordAppend(input3));
        // Expected: "a"

        // Test Case 4 - No word appears twice
        String[] input4 = {"x", "y", "z"};
        System.out.println("Test 4 Output: " + wordAppend(input4));
        // Expected: ""
    }
}
