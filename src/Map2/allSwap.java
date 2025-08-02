package Map2;

import java.util.HashMap;
import java.util.Map;

public class allSwap {

    // Method to perform swaps based on first-character matches
    public static String[] allSwap(String[] strings) {
        Map<Character, Integer> indexMap = new HashMap<>();

        // Iterate through the array once
        for (int i = 0; i < strings.length; i++) {
            String current = strings[i];
            if (current.isEmpty()) continue;

            char key = current.charAt(0); // Get the first character

            // If we have seen this character before, swap the current string with the previous one
            if (indexMap.containsKey(key)) {
                int prevIndex = indexMap.get(key);
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;

                // Remove the key so no more swaps happen with this character
                indexMap.remove(key);
            } else {
                // Store the index of the first occurrence of the character
                indexMap.put(key, i);
            }
        }

        return strings;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test Case 1
        String[] input1 = {"ab", "ac"};
        System.out.print("Test 1 Output: ");
        printArray(allSwap(input1));

        // Test Case 2
        String[] input2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.print("Test 2 Output: ");
        printArray(allSwap(input2));

        // Test Case 3
        String[] input3 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        System.out.print("Test 3 Output: ");
        printArray(allSwap(input3));
    }

    // Helper method to print array nicely
    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\"" + arr[i] + "\"");
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
