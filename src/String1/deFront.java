package String1;

public class deFront {
    // Method to modify the string according to the deFront rules
    public static String deFront(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'a') {
            result += str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'b') {
            result += str.charAt(1);
        }
        if (str.length() > 2) {
            result += str.substring(2);
        }
        return result;
    }
    // Main method to test different cases
    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
        System.out.println(deFront("abacus"));
        System.out.println(deFront("xby"));
        System.out.println(deFront(""));
    }
}
