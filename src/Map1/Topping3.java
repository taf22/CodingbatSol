package Map1;

import java.util.HashMap;
import java.util.Map;

public class Topping3 {

    /**
     * Modifies the map as follows:
     * - If "potato" exists, set "fries" to the same value.
     * - If "salad" exists, set "spinach" to the same value.
     */
    public static Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    public static void main(String[] args) {
        // Test case 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("potato", "ketchup");
        System.out.println("Input: " + map1);
        System.out.println("Output: " + topping3(map1));
        System.out.println();

        // Test case 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("potato", "butter");
        System.out.println("Input: " + map2);
        System.out.println("Output: " + topping3(map2));
        System.out.println();

        // Test case 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("salad", "oil");
        map3.put("potato", "ketchup");
        System.out.println("Input: " + map3);
        System.out.println("Output: " + topping3(map3));
    }
}
