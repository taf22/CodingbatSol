package Map2;

import java.util.*;

public class WordLen {

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, str.length());  // Set string as key, its length as value
        }
        return map;
    }

    public static void main(String[] args) {
        // Test 1
        String[] input1 = {"a", "bb", "a", "bb"};
        System.out.println("Test 1: " + wordLen(input1)); // Expected: {a=1, bb=2}

        // Test 2
        String[] input2 = {"this", "and", "that", "and"};
        System.out.println("Test 2: " + wordLen(input2)); // Expected: {this=4, and=3, that=4}

        // Test 3
        String[] input3 = {"code", "code", "code", "bug"};
        System.out.println("Test 3: " + wordLen(input3)); // Expected: {code=4, bug=3}

        // Test 4: Empty array
        String[] input4 = {};
        System.out.println("Test 4: " + wordLen(input4)); // Expected: {}

        // Test 5: Unique strings
        String[] input5 = {"x", "xyz", "hello", "java"};
        System.out.println("Test 5: " + wordLen(input5)); // Expected: {x=1, xyz=3, hello=5, java=4}
    }
}
