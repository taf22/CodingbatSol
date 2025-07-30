package String1;

public class right2 {
    public static void main(String[] args) {
        right2 obj = new right2();
        System.out.println(obj.right2("Hello"));  // Output: "loHel"
        System.out.println(obj.right2("java"));   // Output: "vaja"
        System.out.println(obj.right2("Hi"));     // Output: "Hi"
    }

    public String right2(String str) {
        int len = str.length();
        if (len <= 2) {
            return str;
        }
        String end = str.substring(len - 2);
        String start = str.substring(0, len - 2);
        return end + start;
    }
}

