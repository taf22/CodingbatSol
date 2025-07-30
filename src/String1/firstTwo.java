package String1;

public class firstTwo {
    public static String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("ab"));
        System.out.println(firstTwo("X"));
        System.out.println(firstTwo(""));
    }
}

