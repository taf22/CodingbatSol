package Map1;

import java.util.HashMap;
import java.util.Map;

public class mapShare {

    /**
     * Modifies and returns the given map as follows:
     * - If the key "a" has a value, set the key "b" to have that same value.
     * - Remove the key "c" if it exists.
     */
    public static Map<String, String> mapShare(Map<String, String> map) {
        // If map contains key "a", copy its value to "b"
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }

        // Remove key "c" if it exists
        map.remove("c");

        return map;
    }

    // Main method to test the mapShare function
    public static void main(String[] args) {
        // Example 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c", "ccc");
        System.out.println("Before: " + map1);
        System.out.println("After: " + mapShare(map1));

        // Example 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "xyz");
        map2.put("c", "ccc");
        System.out.println("\nBefore: " + map2);
        System.out.println("After: " + mapShare(map2));

        // Example 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("c", "meh");
        map3.put("d", "hi");
        System.out.println("\nBefore: " + map3);
        System.out.println("After: " + mapShare(map3));
    }
}
