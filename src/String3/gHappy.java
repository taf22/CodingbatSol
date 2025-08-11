package String3;

public class gHappy {
    public static boolean gHappy(String str) {
        int len = str.length();

        for (int i = 0; i < len; i++) {
            // Check if the current character is 'g'
            if (str.charAt(i) == 'g') {
                boolean isHappy = false;

                // Check the character before, if any
                if (i > 0 && str.charAt(i - 1) == 'g') {
                    isHappy = true;
                }

                // Check the character after, if any
                if (i < len - 1 && str.charAt(i + 1) == 'g') {
                    isHappy = true;
                }

                // If this 'g' has no happy neighbor, return false
                if (!isHappy) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(gHappy("xxggxx"));
        System.out.println(gHappy("xxgxx"));
        System.out.println(gHappy("xxggyygxx"));
        System.out.println(gHappy("gg"));
        System.out.println(gHappy("g"));
        System.out.println(gHappy("abc"));
    }
}
