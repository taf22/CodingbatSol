package String2;

public class OneTwoExample {
    // Method that rearranges each group of 3 chars as described
    public static String oneTwo(String str) {
        StringBuilder result = new StringBuilder();
        // Process the string in groups of 3 characters
        for (int i = 0; i < str.length() - 2; i += 3) {
            // Move the first character of the group to after the next two characters
            result.append(str.charAt(i + 1));
            result.append(str.charAt(i + 2));
            result.append(str.charAt(i));
        }
        // Ignore any remaining characters fewer than 3
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));
        System.out.println(oneTwo("tca"));
        System.out.println(oneTwo("tcagdo"));
        System.out.println(oneTwo("abcdef"));
        System.out.println(oneTwo("ab"));
        System.out.println(oneTwo(""));
    }
}
