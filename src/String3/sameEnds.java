package String3;

public class sameEnds {
    /**
     * Returns the longest substring that appears at both the beginning and end
     * of the given string without overlapping.
     */
    public static String sameEnds(String string) {
        int len = string.length();
        for (int i = len / 2; i > 0; i--) {
            String prefix = string.substring(0, i);
            String suffix = string.substring(len - i);
            // If both match, return the matching part
            if (prefix.equals(suffix)) {
                return prefix;
            }
        }
        // If no match is found, return empty string
        return "";
    }
    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab"));
        System.out.println(sameEnds("xx"));
        System.out.println(sameEnds("xxx"));
        System.out.println(sameEnds("abcdef"));
    }
}

