package String1;

public class makeTags {
    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(makeTags("i", "Yay"));
        System.out.println(makeTags("i", "Hello"));
        System.out.println(makeTags("cite", "Yay"));
        System.out.println(makeTags("b", "BoldText"));
        System.out.println(makeTags("u", "Underline"));
    }
}

