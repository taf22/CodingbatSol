package String2;

public class endOther {

    /**
     * This method returns true if either string appears at the end
     * of the other, case-insensitively.
     */
    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        return a.endsWith(b) || b.endsWith(a);
    }
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc"));     // true
        System.out.println(endOther("AbC", "HiaBc"));     // true
        System.out.println(endOther("abc", "abXabc"));    // true
    }
}

