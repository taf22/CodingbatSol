package String2;

 public class xyzMiddle {

    // Method to check if "xyz" appears in the middle of the string
    public static boolean xyzMiddle(String str) {
        int len = str.length();
        // "xyz" must be at least 3 characters in, so check for short strings first
        if (len < 3) return false;
        // Calculate middle index range depending on string length
        int mid = len / 2;
        // If the length is even, check two possible middles
        if (len % 2 == 0) {
            return str.substring(mid - 1, mid + 2).equals("xyz") ||
                    str.substring(mid - 2, mid + 1).equals("xyz");
        } else {
            // For odd-length strings, only one middle
            return str.substring(mid - 1, mid + 2).equals("xyz");
        }
    }
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
        System.out.println(xyzMiddle("xyz"));
        System.out.println(xyzMiddle("xy"));
        System.out.println(xyzMiddle("xyxyzxy"));
    }
}

