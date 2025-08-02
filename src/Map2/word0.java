package Map2;

import java.util.*;

public class word0 {

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, 0); // Each unique word is added with value 0
        }
        return map;
    }

    public static void main(String[] args) {
        // Test 1
        String[] input1 = {"a", "b", "a", "b"};
        System.out.println("Test 1: " + word0(input1)); // Expected: {a=0, b=0}

        // Test 2
        String[] input2 = {"a", "b", "a", "c", "b"};
        System.out.println("Test 2: " + word0(input2)); // Expected: {a=0, b=0, c=0}

        // Test 3
        String[] input3 = {"c", "b", "a"};
        System.out.println("Test 3: " + word0(input3)); // Expected: {a=0, b=0, c=0}

        // Test 4: empty input
        String[] input4 = {};
        System.out.println("Test 4: " + word0(input4)); // Expected: {}

        // Test 5: repeated single value
        String[] input5 = {"x", "x", "x"};
        System.out.println("Test 5: " + word0(input5)); // Expected: {x=0}
    }
}
