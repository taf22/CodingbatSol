package String1;

public class extraEnd {

        public static void main(String[] args) {
            extraEnd obj = new extraEnd();
            System.out.println(obj.extraEnd("Hello"));
            System.out.println(obj.extraEnd("ab"));
            System.out.println(obj.extraEnd("Hi"));
        }
        public String extraEnd(String str) {
            // Get the last two characters
            String lastTwo = str.substring(str.length() - 2);
            // Return three copies of lastTwo concatenated
            return lastTwo + lastTwo + lastTwo;
        }
    }


