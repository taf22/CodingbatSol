package String1;

public class makeOutWord {

    // This program inserts a word into the middle of a 4-character string (like "<<>>")
        // This method takes two strings: 'out' (length 4) and 'word'
        // It returns a new string with 'word' inserted between the first two and last two characters of 'out'
        public static String makeOutWord(String out, String word) {
            String start = out.substring(0, 2); // First 2 characters
            String end = out.substring(2);     // Last 2 characters
            return start + word + end;         // Combine all parts
        }
        // Main method to test the makeOutWord function
        public static void main(String[] args) {
            System.out.println(makeOutWord("<<>>", "Yay"));
            System.out.println(makeOutWord("<<>>", "WooHoo"));
            System.out.println(makeOutWord("[[]]", "word"));
        }
    }


