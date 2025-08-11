package String3;

public class countTriple {

    // We'll say that a "triple" in a string is a char appearing three times in a row.
    // Return the number of triples in the given string. Triples may overlap.
    public static int countTriple(String str) {
        int count = 0;

        // Loop through the string up to the third last character
        for (int i = 0; i < str.length() - 2; i++) {
            char current = str.charAt(i);

            // Check if current char equals the next two characters
            if (current == str.charAt(i + 1) && current == str.charAt(i + 2)) {
                count++; // Found a triple
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(countTriple("abcXXXabc"));
        System.out.println(countTriple("xxxabyyyycd"));
        System.out.println(countTriple("a"));
        System.out.println(countTriple("222abyyy2222cd"));
        System.out.println(countTriple(""));
    }
}
