package String2;

public class repeatFront {

    // Method to return a string made of progressively shorter prefixes of the original string
    public static String repeatFront(String str, int n) {
        // Initialize an empty result string
        String result = "";

        // Loop from n down to 1, appending the substring from index 0 to i
        for (int i = n; i > 0; i--) {
            result += str.substring(0, i);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4));
        System.out.println(repeatFront("Chocolate", 3));
        System.out.println(repeatFront("Ice Cream", 2));
        System.out.println(repeatFront("Java", 0));
        System.out.println(repeatFront("Hello", 5));
    }
}
