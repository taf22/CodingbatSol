package Map1;

import java.util.Map;
import java.util.HashMap;

public class mapAB2 {

    // Method that solves the CodingBat mapAB2 problem
    public static Map<String, String> mapAB2(Map<String, String> map) {
        // Check if both keys "a" and "b" are present in the map
        if (map.containsKey("a") && map.containsKey("b")) {
            // If the values for "a" and "b" are equal, remove both keys
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }

        // Return the modified map
        return map;
    }

    // Main method to test the mapAB2 logic
    public static void main(String[] args) {

        // Example 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "aaa");
        map1.put("c", "cake");
        System.out.println("Before: " + map1);
        System.out.println("After: " + mapAB2(map1)); // Should remove "a" and "b"

        // Example 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aaa");
        map2.put("b", "bbb");
        System.out.println("\nBefore: " + map2);
        System.out.println("After: " + mapAB2(map2)); // Should leave "a" and "b"

        // Example 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        map3.put("c", "aaa");
        System.out.println("\nBefore: " + map3);
        System.out.println("After: " + mapAB2(map3)); // Should leave "a", "b", "c"
    }
}
