package String1;

public class withoutEnd {
        public static void main(String[] args) {
            withoutEnd obj = new withoutEnd();

            System.out.println(obj.withoutEnd("Hello"));
            System.out.println(obj.withoutEnd("java"));
            System.out.println(obj.withoutEnd("coding"));
        }

        public String withoutEnd(String str) {
            // Return string without first and last character
            return str.substring(1, str.length() - 1);
        }
    }


