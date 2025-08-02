package Map1;

import java.util.Map;
import java.util.HashMap;

public class topping1 {
    // 1. If "ice cream" is in the map, set its value to "cherry".
    // 2. Always set "bread" to "butter", whether it exists or not.
    public static Map<String, String> topping1(Map<String, String> map) {
        // If map contains the key "ice cream", change its value to "cherry"
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }

        // Set the value for "bread" to "butter" no matter what
        map.put("bread", "butter");

        // Return the updated map
        return map;
    }

    // This is the main method where we test our function with examples
    public static void main(String[] args) {

        // Test Case 1: Map contains "ice cream"
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "peanuts");
        System.out.println("Before: " + map1);
        System.out.println("After: " + topping1(map1));

        // Test Case 2: Map is empty
        Map<String, String> map2 = new HashMap<>();
        System.out.println("\nBefore: " + map2);
        System.out.println("After: " + topping1(map2));

        // Test Case 3: Map has some other key ("pancake")
        Map<String, String> map3 = new HashMap<>();
        map3.put("pancake", "syrup");
        System.out.println("\nBefore: " + map3);
        System.out.println("After: " + topping1(map3));
    }
}

