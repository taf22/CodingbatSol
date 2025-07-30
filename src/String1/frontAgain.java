package String1;

public class frontAgain {
    public static boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        return str.substring(0, 2).equals(str.substring(str.length() - 2));
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
        System.out.println(frontAgain("a"));
        System.out.println(frontAgain("abcab"));
        System.out.println(frontAgain("abABab"));
    }
}
