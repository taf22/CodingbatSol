package String1;

public class startWord {
        public static void main(String[] args) {
            startWord tester = new startWord();
            System.out.println(tester.startWord("hippo", "hi"));   
            System.out.println(tester.startWord("hippo", "xip"));
            System.out.println(tester.startWord("hippo", "i"));
            System.out.println(tester.startWord("hippo", "hippo"));
            System.out.println(tester.startWord("hippo", "xyz"));
            System.out.println(tester.startWord("a", "b"));
            System.out.println(tester.startWord("a", "ba"));
        }
        public String startWord(String str, String word) {
            if (str.length() < word.length()) {
                return "";
            }
            if (str.substring(1, word.length()).equals(word.substring(1))) {
                return str.substring(0, word.length());
            }
            return "";
        }
    }



