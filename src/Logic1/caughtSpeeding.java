package Logic1;

public class caughtSpeeding {

    //  returns ticket level based on speed and birthday rule
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int allowance = isBirthday ? 5 : 0;

        if (speed <= 60 + allowance) {
            return 0;  // no ticket
        } else if (speed <= 80 + allowance) {
            return 1;  // small ticket
        } else {
            return 2;  // big ticket
        }
    }

    // test the caughtSpeeding logic
    public static void main(String[] args) {
        System.out.println("Input: 60, false → Output: " + caughtSpeeding(60, false));
        System.out.println("Input: 65, false → Output: " + caughtSpeeding(65, false));
        System.out.println("Input: 65, true  → Output: " + caughtSpeeding(65, true));
        System.out.println("Input: 85, false → Output: " + caughtSpeeding(85, false));
        System.out.println("Input: 85, true  → Output: " + caughtSpeeding(85, true));
    }
}
