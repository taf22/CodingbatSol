package Warmup2;

public class last2 {

    public static int last2(String str) {
        // If the string length is less than 2, there can't be any matches
        if (str.length() < 2) {
            return 0;
        }
        String last2 = str.substring(str.length() - 2);
        int count = 0;
        // Loop through the string, stopping before the last 2 characters
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(last2)) {
                count++;
            }
        }

        return count;
    }
    // Main method to test the function
    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
        System.out.println(last2("hi"));
        System.out.println(last2("h"));
    }
}
