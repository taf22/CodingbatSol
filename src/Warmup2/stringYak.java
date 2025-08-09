package Warmup2;


public class stringYak {

    // Method to remove "yak"-like patterns from the string
    public static String stringYak(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            // Check for the pattern "y?k"
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                // Skip this "yak" pattern
                i += 2;  // skip next two characters as well
            } else {
                // Add the current character to result
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));
        System.out.println(stringYak("yak"));
        System.out.println(stringYak("hello"));
        System.out.println(stringYak("yakxxxyak"));
    }
}
