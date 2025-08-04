package Warmup2;
public class countXX {

    // Method to count overlapping occurrences of "xx"
    public static int countXX(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }

        return count;
    }

    // Main method to test the countXX method
    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
        System.out.println(countXX("x"));
        System.out.println(countXX(""));
        System.out.println(countXX("xxabxx"));
    }
}
