package String3;

public class mirrorEnds {
    /**
     * Returns the longest prefix of the string that matches the reverse of the suffix.
     * In other words, finds a mirror image from beginning and end.
     */
    public static String mirrorEnds(String string) {
        StringBuilder result = new StringBuilder();

        // Loop through the string from the start
        for (int i = 0; i < string.length(); i++) {
            // Compare character at the beginning and its mirror from the end
            if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
                result.append(string.charAt(i));  // If they match, add to result
            } else {
                break;  // Stop when a mismatch is found
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));
        System.out.println(mirrorEnds("abcd"));
    }
}
