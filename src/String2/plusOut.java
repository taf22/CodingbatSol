package String2;
public class plusOut {

    public static String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            // Check if the substring starting at i matches word
            if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
                result.append(word);
                i += word.length();
            } else {
                result.append("+");
                i++;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));
        System.out.println(plusOut("12xy34", "1"));
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
        System.out.println(plusOut("abcabc", "abc"));
        System.out.println(plusOut("hello", "ll"));
        System.out.println(plusOut("hello", "z"));
    }
}
