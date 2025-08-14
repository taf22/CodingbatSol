package Functional2;
    import java.util.*;

    public class no9{

        // Method to remove numbers that end with 9
        public static List<Integer> no9(List<Integer> nums) {
            nums.removeIf(n -> n % 10 == 9);
            return nums;
        }
        public static void main(String[] args) {
            List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 19));
            List<Integer> list2 = new ArrayList<>(Arrays.asList(9, 19, 29, 3));
            List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3));

            System.out.println(no9(list1));
            System.out.println(no9(list2));
            System.out.println(no9(list3));
        }
    }

