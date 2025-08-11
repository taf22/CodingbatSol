package Functional2;

import java.util.*;

public class noNeg {

    // Method to remove negative numbers from the list
    public static List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

    // Main method to test the function
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, -2));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(-3, -3, 3, 3));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(-1, -1, -1));

        System.out.println(noNeg(list1));
        System.out.println(noNeg(list2));
        System.out.println(noNeg(list3));
    }
}

