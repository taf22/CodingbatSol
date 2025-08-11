package String2;

public class starOut {

    /**
     * Returns a version of the given string where for every '*' in the string,
     * the '*' and the chars immediately to its left and right are gone.
     */
    public static String starOut(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            // Skip current character if it's a '*' or next to a '*'
            if ((i > 0 && str.charAt(i - 1) == '*') ||
                    (str.charAt(i) == '*') ||
                    (i < str.length() - 1 && str.charAt(i + 1) == '*')) {
                continue;
            }

            result.append(str.charAt(i)); // Safe character
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eil*llly"));
        System.out.println(starOut("*ab"));
        System.out.println(starOut("ab*"));
        System.out.println(starOut("a*b*c"));
        System.out.println(starOut("hello"));
        System.out.println(starOut("*"));
        System.out.println(starOut(""));
    }
}

