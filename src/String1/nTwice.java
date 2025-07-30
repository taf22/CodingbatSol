package String1;

public class nTwice {
    // Method to return the first and last n characters combined
    public static String nTwice(String str, int n) {
        String firstPart = str.substring(0, n); // first n chars
        String lastPart = str.substring(str.length() - n); // last n chars
        return firstPart + lastPart;
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println(nTwice("Hello", 2));
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));
        System.out.println(nTwice("coding", 2));
        System.out.println(nTwice("java", 2));
    }
}

