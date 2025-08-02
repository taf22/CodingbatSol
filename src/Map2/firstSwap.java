package Map2;

import java.util.HashMap;
import java.util.Map;

public class firstSwap {

    // Method to perform only the first swap based on matching first characters
    public static String[] firstSwap(String[] strings) {
        Map<Character, Integer> indexMap = new HashMap<>();
        Map<Character, Boolean> swapped = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String current = strings[i];
            if (current.isEmpty()) continue;

            char key = current.charAt(0);

            // Only swap once for each character
            if (swapped.getOrDefault(key, false)) {
                continue;
            }

            if (indexMap.containsKey(key)) {
                int prevIndex = indexMap.get(key);

                // Swap the strings
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;

                // Mark the key as already swapped
                swapped.put(key, true);
            } else {
                // First time seeing this key, store the index
                indexMap.put(key, i);
            }
        }

        return strings;
    }

    // Main method to test the firstSwap method
    public static void main(String[] args) {
        String[] input1 = {"ab", "ac"};
        System.out.print("Test 1 Output: ");
        printArray(firstSwap(input1)); // Output: [ac, ab]

        String[] input2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.print("Test 2 Output: ");
        printArray(firstSwap(input2)); // Output: [ay, by, cy, cx, bx, ax, aaa, azz]

        String[] input3 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        System.out.print("Test 3 Output: ");
        printArray(firstSwap(input3)); // Output: [ay, by, ax, bx, aj, ai, bx, by]
    }

    // Helper method to print a String array nicely
    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\"" + arr[i] + "\"");
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
