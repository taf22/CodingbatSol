package String1;

public class twoChar {
    // Method to return 2 characters starting at given index, or first 2 chars if index is invalid
    public static String twoChar(String str, int index) {
        if (index < 0 || index + 1 >= str.length()) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }
    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        System.out.println(twoChar("java", 0));
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));
        System.out.println(twoChar("hello", -1));
        System.out.println(twoChar("hi", 1));
    }
}
