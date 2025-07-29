package String1;

public class helloName {

    // This is a simple Java program to return a greeting like "Hello Bob!" when a name is given.

    // This method takes a string input 'name' and returns a greeting in the format "Hello name!"
        public static String helloName(String name) {
            return "Hello " + name + "!";
        }
        // The main method is the starting point of any Java program
        public static void main(String[] args) {
            // Test the helloName method with different names
            System.out.println(helloName("Bob"));
            System.out.println(helloName("Alice"));
            System.out.println(helloName("X"));
        }
    }

