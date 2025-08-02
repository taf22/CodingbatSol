package Map2;

import java.util.HashMap;
import java.util.Map;

public class firstChar {

    // Method that builds a map with the first character of each string as key
    // and concatenates strings starting with that character
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        // Loop through each string in the array
        for (String str : strings) {
            // Get the first character of the string as a string (key)
            String key = str.substring(0, 1);

            // If the key already exists, append the string to the existing value
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + str);
            } else {
                // Otherwise, just add the string as the initial value
                map.put(key, str);
            }
        }

        return map;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test Case 1
        String[] input1 = {"salt", "tea", "soda", "toast"};
        Map<String, String> result1 = firstChar(input1);
        System.out.println("Test 1 Output: " + result1);
        // Expected: {s=saltsoda, t=teatoast}

        // Test Case 2
        String[] input2 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        Map<String, String> result2 = firstChar(input2);
        System.out.println("Test 2 Output: " + result2);
        // Expected: {a=aaaAA, b=bb, c=cccCC, d=d}

        // Test Case 3 - Empty input
        String[] input3 = {};
        Map<String, String> result3 = firstChar(input3);
        System.out.println("Test 3 Output: " + result3);
        // Expected: {}
    }
}

