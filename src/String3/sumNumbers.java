package String3;

public class sumNumbers {
    // Method that returns the sum of all numbers in the string
    public static int sumNumbers(String str) {
        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                num += c; // Build the number as a string
            } else {
                if (!num.equals("")) {
                    sum += Integer.parseInt(num); // Add completed number to sum
                    num = ""; // Reset for next number
                }
            }
        }
        // Check if there's a number at the end
        if (!num.equals("")) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("7 11"));
        System.out.println(sumNumbers("Chocolate"));
        System.out.println(sumNumbers("5h6i7"));
    }
}
