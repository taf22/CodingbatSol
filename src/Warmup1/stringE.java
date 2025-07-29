package Warmup1;

public class stringE {

    public static void main(String[] args) {
        // Test cases for the stringE function
        System.out.println(stringE("Hello"));  // "Hello" has 1 'e'
        System.out.println(stringE("Heello")); //  "Heello" has 2 'e's
        System.out.println(stringE("Heeeee")); //  "Heeeee" has more than 3 'e's
        System.out.println(stringE("Hi"));     //  "Hi" has 0 'e's
    }

    public static boolean stringE(String str) {
        int count = 0;

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }

        // Return true if the count is between 1 and 3 (inclusive)
        return (count >= 1 && count <= 3);
    }
}
