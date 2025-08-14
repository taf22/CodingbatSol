package Logic1;

public class cigarParty {

    //  check if the party is successful
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;  // No upper bound on weekends
        } else {
            return cigars >= 40 && cigars <= 60;
        }
    }

    public static void main(String[] args) {
        // Example 1
        int cigars1 = 30;
        boolean weekend1 = false;
        System.out.println("Input: " + cigars1 + ", weekend: " + weekend1);
        System.out.println("Output: " + cigarParty(cigars1, weekend1));

        // Example 2
        int cigars2 = 50;
        boolean weekend2 = false;
        System.out.println("Input: " + cigars2 + ", weekend: " + weekend2);
        System.out.println("Output: " + cigarParty(cigars2, weekend2));

        // Example 3
        int cigars3 = 70;
        boolean weekend3 = true;
        System.out.println("Input: " + cigars3 + ", weekend: " + weekend3);
        System.out.println("Output: " + cigarParty(cigars3, weekend3));
    }
}

