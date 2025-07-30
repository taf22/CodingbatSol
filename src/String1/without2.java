package String1;

public class without2 {
    public static String without2(String str) {
        if (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        }
        return str;
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("Hi"));
        System.out.println(without2("Hix"));
        System.out.println(without2("HiHi"));
    }
}


