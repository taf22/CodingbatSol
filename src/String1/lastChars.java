package String1;

public class lastChars {


        public static String lastChars(String a, String b) {
            // Get first char of a or '@' if empty
            char firstChar = (a.length() > 0) ? a.charAt(0) : '@';
            // Get last char of b or '@' if empty
            char lastChar = (b.length() > 0) ? b.charAt(b.length() - 1) : '@';
            // Build and return the new string
            return "" + firstChar + lastChar;
        }
        public static void main(String[] args) {
            System.out.println(lastChars("last", "chars"));
            System.out.println(lastChars("yo", "java"));
            System.out.println(lastChars("hi", ""));
            System.out.println(lastChars("", "hello"));
            System.out.println(lastChars("", ""));
        }
    }
