package String1;

public class makeAbba {
        public static void main(String[] args) {
            // Create an instance of the class containing makeAbba
            makeAbba obj = new makeAbba();
            // Test cases
            System.out.println(obj.makeAbba("Hi", "Bye"));
            System.out.println(obj.makeAbba("Yo", "Alice"));
            System.out.println(obj.makeAbba("What", "Up"));
        }
        public String makeAbba(String a, String b) {
            return a + b + b + a;
        }
    }


