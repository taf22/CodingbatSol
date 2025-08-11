package String3;

public class equalIsNot {

    // Given a string, return true if the number of appearances of "is" anywhere in the string
    // is equal to the number of appearances of "not" anywhere in the string (case sensitive).
    public static boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;
        // Count all occurrences of "is"
        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("is")) {
                countIs++;
            }
        }
        // Count all occurrences of "not"
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("not")) {
                countNot++;
            }
        }
        // Return true if counts are equal, false otherwise
        return countIs == countNot;
    }
    public static void main(String[] args) {
        System.out.println(equalIsNot("This is not"));
        System.out.println(equalIsNot("This is notnot"));
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }
}

