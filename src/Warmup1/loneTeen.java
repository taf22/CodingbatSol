package Warmup1;

public class loneTeen {

        public static void main(String[] args) {
            // Test cases for the loneTeen function
            System.out.println(loneTeen(13, 15));  // true (both are teens, but it will return false)
            System.out.println(loneTeen(13, 20));  // true (13 is a teen, 20 is not)
            System.out.println(loneTeen(22, 18));  // true (18 is a teen, 22 is not)
            System.out.println(loneTeen(22, 22));  // false (neither is a teen)
            System.out.println(loneTeen(10, 10));  // false (neither is a teen)
        }

        public static boolean loneTeen(int a, int b) {
            // Check if 'a' is a teen (13 to 19) and store it in a boolean var
            // Do the same for 'b' and store it in a separate boolean var
            boolean aTeen = (a >= 13 && a <= 19);
            boolean bTeen = (b >= 13 && b <= 19);

            // Return true if one of them is a teen, but not both
            return (aTeen && !bTeen) || (!aTeen && bTeen);
            // Basically: One is a teen, the other is not. If both are teens, return false.
            // We could use the xor operator for this, but it's a bit less readable.
        }
    }
