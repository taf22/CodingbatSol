package Map1;

import java.util.HashMap;
import java.util.Map;

public class mapAB3 {

    /**
     * If exactly one of the keys "a" or "b" exists in the map (but not both),
     * set the missing one to have the same value as the one that exists.
     */
    public static Map<String, String> mapAB3(Map<String, String> map) {
        // Check if "a" exists in the map
        boolean hasA = map.containsKey("a");
        // Check if "b" exists in the map
        boolean hasB = map.containsKey("b");

        // If only "a" is present, copy its value to "b"
        if (hasA && !hasB) {
            map.put("b", map.get("a"));
        }
        // If only "b" is present, copy its value to "a"
        else if (!hasA && hasB) {
            map.put("a", map.get("b"));
        }

        return map;
    }

    public static void main(String[] args) {
        // Test 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("c", "cake");
        System.out.println("Input: " + map1);
        System.out.println("Output: " + mapAB3(map1));
        System.out.println();

        // Test 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "bbb");
        map2.put("c", "cake");
        System.out.println("Input: " + map2);
        System.out.println("Output: " + mapAB3(map2));
        System.out.println();

        // Test 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        map3.put("c", "cake");
        System.out.println("Input: " + map3);
        System.out.println("Output: " + mapAB3(map3));
    }
}
