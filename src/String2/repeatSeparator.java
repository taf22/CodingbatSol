package String2;

public class repeatSeparator {

    // Method to return a string with 'word' repeated 'count' times, separated by 'sep'
    public static String repeatSeparator(String word, String sep, int count) {
        // If count is 0, return an empty string
        if (count == 0) {
            return "";
        }

        // Initialize the result string with the first 'word'
        String result = word;

        // Append separator and word (count - 1) times
        for (int i = 1; i < count; i++) {
            result += sep + word;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));
        System.out.println(repeatSeparator("Hello", "-", 4));
        System.out.println(repeatSeparator("Hi", "*", 0));
    }
}
