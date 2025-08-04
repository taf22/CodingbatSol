package Warmup2;

public class stringBits {

    public static String stringBits(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }

        return result;
    }

    // Main method for testing the stringBits method
    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
        System.out.println(stringBits(""));
        System.out.println(stringBits("A"));
        System.out.println(stringBits("ABCD"));
    }
}
