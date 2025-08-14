package Logic1;

public class squirrelPlay {

    // determine if squirrels play
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        int upper = isSummer ? 100 : 90;
        return temp >= 60 && temp <= upper;
    }

    // test the squirrelPlay method
    public static void main(String[] args) {
        // Example 1
        System.out.println("Input: 70, false");
        System.out.println("Output: " + squirrelPlay(70, false));

        // Example 2
        System.out.println("Input: 95, false");
        System.out.println("Output: " + squirrelPlay(95, false));

        // Example 3
        System.out.println("Input: 95, true");
        System.out.println("Output: " + squirrelPlay(95, true));
    }
}

