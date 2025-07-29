package Warmup1;

public class backAround {
    public static void main(String[] args) {
        backAround obj = new backAround();

        System.out.println(obj.backAround("cat"));   // "tcatt"
        System.out.println(obj.backAround("Hello")); // "oHelloo"
        System.out.println(obj.backAround("a"));     // "aaa"
    }

    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }
}

