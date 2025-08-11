package String2;

public class repeatEnd {

    // Method to repeat the last n characters of a string, n times
    public static String repeatEnd(String str, int n) {
        // Get the last n characters of the string
        String end = str.substring(str.length() - n);

        // Initialize an empty result string
        String result = "";

        // Append 'end' to result n times
        for (int i = 0; i < n; i++) {
            result += end;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
        System.out.println(repeatEnd("Coding", 4));
        System.out.println(repeatEnd("Java", 0));
    }
}

