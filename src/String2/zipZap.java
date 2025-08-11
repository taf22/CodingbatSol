package String2;


public class zipZap{

    // Method to remove the middle character in "z?p" patterns
    public static String zipZap(String str) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < str.length()) {
            // If we find a pattern starting with 'z' and ending with 'p' and at least 3 characters ahead
            if (i <= str.length() - 3 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result.append("zp");  // Skip the middle character
                i += 3;               // Move past the "z?p" pattern
            } else {
                result.append(str.charAt(i));  // Regular character
                i++;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzopzzzp"));
        System.out.println(zipZap("zzz"));
        System.out.println(zipZap("zipzap"));
        System.out.println(zipZap("hello"));
        System.out.println(zipZap("zupzap"));
    }
}