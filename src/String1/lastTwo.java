package String1;

public class lastTwo {
    public static void main(String[] args) {
        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("cat"));
        System.out.println(lastTwo("ab"));
        System.out.println(lastTwo("a"));
        System.out.println(lastTwo(""));
    }

    public static String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        String start = str.substring(0, str.length() - 2);
        String last = str.substring(str.length() - 2);
        return start + last.charAt(1) + last.charAt(0);
    }
}
