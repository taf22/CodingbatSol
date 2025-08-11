package String3;

public class withoutString {

    public static String withoutString(String base, String remove) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int removeLen = remove.length();
        while (i < base.length()) {

            if (i + removeLen <= base.length() &&
                    base.substring(i, i + removeLen).equalsIgnoreCase(remove)) {
                i += removeLen;
            } else {
                result.append(base.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(withoutString("Hello there", "llo"));
        System.out.println(withoutString("Hello there", "e"));
        System.out.println(withoutString("Hello there", "x"));
        System.out.println(withoutString("xxx", "xx"));
    }
}

