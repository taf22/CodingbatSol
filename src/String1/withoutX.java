package String1;

public class withoutX {
    public static String withoutX(String str) {
        if (str.length() == 0) return "";
        if (str.length() == 1 && str.equals("x")) return "";
        // Remove 'x' at the start
        if (str.startsWith("x")) {
            str = str.substring(1);
        }
        // Remove 'x' at the end
        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hix"));
        System.out.println(withoutX("Hi"));
        System.out.println(withoutX("x"));
        System.out.println(withoutX(""));
    }
}
