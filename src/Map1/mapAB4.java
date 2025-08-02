package Map1;

import java.util.*;

public class mapAB4 {

    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String aVal = map.get("a");
            String bVal = map.get("b");

            if (aVal.length() > bVal.length()) {
                map.put("c", aVal);
            } else if (bVal.length() > aVal.length()) {
                map.put("c", bVal);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    public static void main(String[] args) {
        // Test case 1
        Map<String, String> test1 = new HashMap<>();
        test1.put("a", "aaa");
        test1.put("b", "bb");
        test1.put("c", "cake");
        System.out.println("Test 1: " + mapAB4(test1)); // Expected: {a=aaa, b=bb, c=aaa}

        // Test case 2
        Map<String, String> test2 = new HashMap<>();
        test2.put("a", "aa");
        test2.put("b", "bbb");
        test2.put("c", "cake");
        System.out.println("Test 2: " + mapAB4(test2)); // Expected: {a=aa, b=bbb, c=bbb}

        // Test case 3
        Map<String, String> test3 = new HashMap<>();
        test3.put("a", "aa");
        test3.put("b", "bb");
        test3.put("c", "cake");
        System.out.println("Test 3: " + mapAB4(test3)); // Expected: {a=, b=, c=cake}

        // Test case 4: only one key exists
        Map<String, String> test4 = new HashMap<>();
        test4.put("a", "hello");
        System.out.println("Test 4: " + mapAB4(test4)); // Expected: {a=hello}

        // Test case 5: no a or b
        Map<String, String> test5 = new HashMap<>();
        test5.put("x", "123");
        System.out.println("Test 5: " + mapAB4(test5)); // Expected: {x=123}
    }
}
