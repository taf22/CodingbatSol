package Warmup1;

public class missingChar {
    public static void main(String[] args) {
        missingChar obj = new missingChar();

        System.out.println(obj.missingChar("kitten", 1)); // "ktten"
        System.out.println(obj.missingChar("kitten", 0)); // "itten"
        System.out.println(obj.missingChar("kitten", 4)); // "kittn"
    }

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1);
        return front + back;
    }
}

