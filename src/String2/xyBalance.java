package String2;
public class xyBalance {

    /**
     * This method returns true if for all 'x' characters in the string,
     * there is a 'y' character somewhere later in the string.
     * A single 'y' can balance multiple 'x's.
     */
    public static boolean xyBalance(String str) {
        boolean ySeen = false;

        // Traverse from the end to the start
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'y') {
                ySeen = true;
            }
            if (str.charAt(i) == 'x' && !ySeen) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
        System.out.println(xyBalance("x"));
        System.out.println(xyBalance("y"));
        System.out.println(xyBalance(""));
    }
}

