package Map2;

import java.util.HashMap;
import java.util.Map;

public class wordCount {

    // This method takes an array of strings and returns a Map
    // where each key is a word from the array and the value is the count of how many times it appears.
    public static Map<String, Integer> wordCount(String[] strings) {
        // Create a new HashMap to store the word counts
        Map<String, Integer> map = new HashMap<>();

        // Loop through each word in the array
        for (String word : strings) {
            // If the word is already in the map, increment its count
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                // Otherwise, add it to the map with a count of 1
                map.put(word, 1);
            }
        }

        // Return the completed map
        return map;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test case 1
        String[] input1 = {"a", "b", "a", "c", "b"};
        System.out.println("Test 1: " + wordCount(input1)); // Expected: {a=2, b=2, c=1}

        // Test case 2
        String[] input2 = {"c", "b", "a"};
        System.out.println("Test 2: " + wordCount(input2)); // Expected: {a=1, b=1, c=1}

        // Test case 3
        String[] input3 = {"c", "c", "c", "c"};
        System.out.println("Test 3: " + wordCount(input3)); // Expected: {c=4}
    }
}
