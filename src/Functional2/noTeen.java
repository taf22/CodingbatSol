package Functional2;

import java.util.*;

public class noTeen {

    /**
     * Filters out the "teen" numbers (13 to 19 inclusive) from the input list.
     * @param nums List of integers to filter.
     * @return A new list with all numbers except those between 13 and 19.
     */
    public static List<Integer> noTeen(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();

        for (Integer num : nums) {
            // Check if the number is NOT in the teen range
            if (num < 13 || num > 19) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> test1 = Arrays.asList(12, 13, 19, 20);
        List<Integer> test2 = Arrays.asList(1, 14, 1);
        List<Integer> test3 = Arrays.asList(15);
        List<Integer> test4 = Arrays.asList(10, 11, 17, 20, 21);

        System.out.println("Test 1: " + noTeen(test1));
        System.out.println("Test 2: " + noTeen(test2));
        System.out.println("Test 3: " + noTeen(test3));
        System.out.println("Test 4: " + noTeen(test4));
    }
}

