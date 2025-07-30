package String1;

public class middleTwo {
    // Method that returns the middle two characters of a string of even length
    public static String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }
    // Main method to test the function with examples
    public static void main(String[] args) {
        // Test cases
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
        System.out.println(middleTwo("test"));
    }
}

