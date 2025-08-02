package Map2;

import java.util.*;

public class Pairs {

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str : strings) {
            String firstChar = str.substring(0, 1);
            String lastChar = str.substring(str.length() - 1);
            map.put(firstChar, lastChar);  // Last one with the same key will overwrite
        }
        return map;
    }

    public static void main(String[] args) {
        // Test 1
        String[] input1 = {"code", "bug"};
        System.out.println("Test 1: " + pairs(input1)); // Expected: {b=g, c=e}

        // Test 2
        String[] input2 = {"man", "moon", "main"};
        System.out.println("Test 2: " + pairs(input2)); // Expected: {m=n}

        // Test 3
        String[] input3 = {"man", "moon", "good", "night"};
        System.out.println("Test 3: " + pairs(input3)); // Expected: {m=n, g=d, n=t}

        // Test 4
        String[] input4 = {"apple", "banana", "avocado", "berry"};
        System.out.println("Test 4: " + pairs(input4)); // Expected: {a=o, b=y}

        // Test 5: Empty input
        String[] input5 = {};
        System.out.println("Test 5: " + pairs(input5)); // Expected: {}
    }
}




