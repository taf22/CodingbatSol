package Map1;

import java.util.Map;
import java.util.HashMap;

public class mapBully {

    // This is the method exactly like the one in CodingBat
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    // Testing the method with some sample inputs
    public static void main(String[] args) {
        // Example 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "candy");
        map1.put("b", "dirt");
        System.out.println("Before: " + map1);
        System.out.println("After: " + mapBully(map1));

        // Example 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "candy");
        System.out.println("\nBefore: " + map2);
        System.out.println("After: " + mapBully(map2));

        // Example 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "candy");
        map3.put("b", "carrot");
        map3.put("c", "meh");
        System.out.println("\nBefore: " + map3);
        System.out.println("After: " + mapBully(map3));
    }
}
