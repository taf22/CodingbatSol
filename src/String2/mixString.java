package String2;
public class mixString {

    /**
     * This method takes two strings `a` and `b` and returns a new string
     * formed by alternating characters from each string. If one string is
     * longer, its leftover characters are added at the end.
     */
    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();

        int minLength = Math.min(a.length(), b.length());

        // Mix characters up to the length of the shorter string
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }
        // Append remaining characters from the longer string
        if (a.length() > minLength) {
            result.append(a.substring(minLength));
        } else if (b.length() > minLength) {
            result.append(b.substring(minLength));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
        System.out.println(mixString("", "abc"));
        System.out.println(mixString("123", ""));
    }
}
