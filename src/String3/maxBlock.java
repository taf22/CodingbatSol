package String3;
public class maxBlock {

    // Method to find the length of the largest block
    public static int maxBlock(String str) {
        // Return 0 immediately if the string is empty
        if (str.length() == 0) return 0;
        int max = 1;     // Store the maximum block length
        int current = 1; // Count the current block length
        // Start from the second character
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                current++;  // Increase block length
                if (current > max) {
                    max = current;  // Update max if needed
                }
            } else {
                current = 1;  // Reset current block count
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxBlock("hoopla"));           // ➞ 2
        System.out.println(maxBlock("abbCCCddBBBx"));     // ➞ 3
        System.out.println(maxBlock(""));                 // ➞ 0
        System.out.println(maxBlock("aaaa"));             // ➞ 4
        System.out.println(maxBlock("abbbcddddddee"));    // ➞ 6
    }
}
