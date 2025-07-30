package String1;

public class extraFront {
        public String extraFront(String str) {
            // Get the first two characters or the whole string if it's shorter than 2
            String front = str.length() < 2 ? str : str.substring(0, 2);
            // Return three copies of the front string
            return front + front + front;
        }
        public static void main(String[] args) {
            extraFront obj = new extraFront ();

            System.out.println(obj.extraFront("Hello"));
            System.out.println(obj.extraFront("ab"));
            System.out.println(obj.extraFront("H"));
            System.out.println(obj.extraFront(""));
        }
    }

