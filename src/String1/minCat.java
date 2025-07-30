package String1;

public class minCat {
    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
        System.out.println(minCat("abc", "x"));
        System.out.println(minCat("", "xyz"));
    }
    public static String minCat(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        if (lenA > lenB) {
            a = a.substring(lenA - lenB);
        } else if (lenB > lenA) {
            b = b.substring(lenB - lenA);
        }
        return a + b;
    }
}

