package Map1;

import java.util.HashMap;
import java.util.Map;

public class topping2 {
     //If "ice cream" exists, set "yogurt" to same value as "ice cream"/
    // If "spinach" exists, change its value to "nuts"

    public static Map<String, String> topping2(Map<String, String> map) {
        // If "ice cream" is present, set "yogurt" to its value
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }

        // If "spinach" is present, change its value to "nuts"
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }

        return map;
    }

    // Main method to test the function with sample inputs
    public static void main(String[] args) {
        // Test 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "cherry");
        System.out.println("Input: " + map1);
        System.out.println("Output: " + topping2(map1));
        System.out.println();

        // Test 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("spinach", "dirt");
        map2.put("ice cream", "cherry");
        System.out.println("Input: " + map2);
        System.out.println("Output: " + topping2(map2));
        System.out.println();

        // Test 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("yogurt", "salt");
        System.out.println("Input: " + map3);
        System.out.println("Output: " + topping2(map3));
    }
}
