package String1;

public class left2 {


        public static void main(String[] args) {
            // Create an instance of the class if left2 is not static
            // Or just call left2 directly if it's static
            // Example calls
            System.out.println(left2("Hello"));
            System.out.println(left2("java"));
            System.out.println(left2("Hi"));
        }
        public static String left2(String str) {
            return str.substring(2) + str.substring(0, 2);
        }
    }

