package Warmup2;

public class stringX {

    // Method to remove 'x' characters except at the start or end
    public static String stringX(String str) {
        if (str.length() <= 2) {
            // If the string is short, return as is
            return str;
        }

        // Store the first and last characters
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        // Get the middle part and remove all 'x' from it
        String middle = str.substring(1, str.length() - 1);
        middle = middle.replace("x", "");

        return first + middle + last;
    }

    public static void main(String[] args) {
        // Sample test cases
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
        System.out.println(stringX("x"));
        System.out.println(stringX(""));
        System.out.println(stringX("xx"));
    }
}
