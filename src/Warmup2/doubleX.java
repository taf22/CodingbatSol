package Warmup2;

public class doubleX {

    public static boolean doubleX(String str) {
        int index = str.indexOf('x'); // Find the index of the first 'x'

        // If no 'x' found or it’s the last character, return false
        if (index == -1 || index + 1 >= str.length()) {
            return false;
        }

        return str.charAt(index + 1) == 'x';
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
        System.out.println(doubleX("x"));
        System.out.println(doubleX(""));
        System.out.println(doubleX("abc"));
    }
}
