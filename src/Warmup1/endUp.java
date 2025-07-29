package Warmup1;

public class endUp {

        // Method to convert the last 3 characters of the string to uppercase
        public static String endUp(String str) {
            if (str.length() <= 3) return str.toUpperCase();

            int cut = str.length() - 3;
            String front = str.substring(0, cut);         // part before the last 3 chars
            String back = str.substring(cut);             // last 3 characters

            return front + back.toUpperCase();            // combine and return
        }

        // Main method to test the endUp function
        public static void main(String[] args) {
            System.out.println(endUp("Hello"));    //last 3 characters will be capital
            System.out.println(endUp("hi"));       // All word be capital
            System.out.println(endUp("java"));     //last 3 characters will be capital
            System.out.println(endUp("code"));     //last 3 characters will be capital
            System.out.println(endUp("ok"));       // All word be capital
        }
    }


