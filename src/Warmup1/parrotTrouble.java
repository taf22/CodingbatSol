package Warmup1;

public class parrotTrouble {


        public static void main(String[] args) {
            // Test cases for the parrotTrouble function
            System.out.println(parrotTrouble(true, 6));   //  (parrot is talking before 7 AM)
            System.out.println(parrotTrouble(false, 6));  //  (parrot is not talking)
            System.out.println(parrotTrouble(true, 8));   //  (parrot is talking, but it's 8 AM, within allowed time)
            System.out.println(parrotTrouble(true, 21));  //  (parrot is talking after 8 PM)
            System.out.println(parrotTrouble(false, 22)); //  (parrot is not talking)
        }

        public static boolean parrotTrouble(boolean talking, int hour) {
            // Return true if the parrot is talking and the hour is before 7 AM or after 8 PM
            return (talking && (hour < 7 || hour > 20));
        }
        

}


