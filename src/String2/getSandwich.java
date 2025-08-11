package String2;

public class getSandwich {

    // Method to return the string between the first and last occurrence of "bread"
    public static String getSandwich(String str) {
        // Find the first and last occurrence of "bread"
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        // If there are at least two "bread"s
        if (first != -1 && last != -1 && first != last) {
            return str.substring(first + 5, last); // 5 is the length of "bread"
        }

        // Return empty string if less than 2 "bread"s
        return "";
    }
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));
        System.out.println(getSandwich("breadbread"));
        System.out.println(getSandwich("breadbutterbread"));
        System.out.println(getSandwich("breadbreadbread"));
    }
}
