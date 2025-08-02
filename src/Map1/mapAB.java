package Map1;

import java.util.HashMap;
import java.util.Map;

public class mapAB {

    /**
     * If the map contains both keys "a" and "b", append their values
     * and store the result in key "ab".
     */
    public static Map<String, String> mapAB(Map<String, String> map) {
        // Check if both "a" and "b" exist in the map
        if (map.containsKey("a") && map.containsKey("b")) {
            // Concatenate values of "a" and "b" and store in "ab"
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public static void main(String[] args) {
        // Test case 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");
        System.out.println("Input: " + map1);
        System.out.println("Output: " + mapAB(map1));
        System.out.println();

        // Test case 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");
        System.out.println("Input: " + map2);
        System.out.println("Output: " + mapAB(map2));
        System.out.println();

        // Test case 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "There");
        System.out.println("Input: " + map3);
        System.out.println("Output: " + mapAB(map3));
    }
}
