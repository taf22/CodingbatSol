package Logic1;
public class dateFashion {

    // determine if you get a table
    public static int dateFashion(int you, int date) {
        // If either person is very unstylish
        if (you <= 2 || date <= 2) {
            return 0;
        }

        // If either person is very stylish
        if (you >= 8 || date >= 8) {
            return 2;
        }

        // Otherwise, maybe
        return 1;
    }

    // test the dateFashion method
    public static void main(String[] args) {
        // Example 1
        System.out.println("Input: (5, 10)");
        System.out.println("Output: " + dateFashion(5, 10));

        // Example 2
        System.out.println("Input: (5, 2)");
        System.out.println("Output: " + dateFashion(5, 2));

        // Example 3
        System.out.println("Input: (5, 5)");
        System.out.println("Output: " + dateFashion(5, 5));  
    }
}
