package String3;

public class sumDigits {
    /**
     * Given a string, return the sum of all digits (0-9) that appear in the string.
     * Ignore non-digit characters. Return 0 if there are no digits in the string.
     */
    public static int sumDigits(String str) {
        int sum = 0;
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if the character is a digit (0-9)
            if (Character.isDigit(c)) {
                // Convert the digit character to an integer and add to sum
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDigits("aa1bc2d3"));
        System.out.println(sumDigits("aa11b33"));
        System.out.println(sumDigits("Chocolate"));
        System.out.println(sumDigits("5h7w9e2"));
    }
}

