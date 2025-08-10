package String2;

public class doubleChar {
    /**
     * This method takes a string and returns a new string
     * where each character in the original string is doubled.
     */
    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result += c;
            result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
    }
}
