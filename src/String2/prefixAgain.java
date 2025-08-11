package String2;

public class prefixAgain {

    // Method to check if the prefix of length 'n' appears again in the string
    public static boolean prefixAgain(String str, int n) {
        // Extract the prefix of length n
        String prefix = str.substring(0, n);

        // Check if this prefix appears again in the rest of the string
        for (int i = 1; i <= str.length() - n; i++) {
            if (str.substring(i, i + n).equals(prefix)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 1));
        System.out.println(prefixAgain("abXYabc", 2));
        System.out.println(prefixAgain("abXYabc", 3));
        System.out.println(prefixAgain("abcdabc", 3));
        System.out.println(prefixAgain("abcdefg", 2));
    }
}
