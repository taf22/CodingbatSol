package Logic1;

public class AlarmClock {

    //  determine alarm time based on day and vacation status
    public static String alarmClock(int day, boolean vacation) {
        boolean isWeekend = (day == 0 || day == 6);

        if (vacation) {
            return isWeekend ? "off" : "10:00";
        } else {
            return isWeekend ? "10:00" : "7:00";
        }
    }

    //  test various cases
    public static void main(String[] args) {
        System.out.println("alarmClock(1, false) → " + alarmClock(1, false));
        System.out.println("alarmClock(5, false) → " + alarmClock(5, false));
        System.out.println("alarmClock(0, false) → " + alarmClock(0, false));
        System.out.println("alarmClock(0, true) → " + alarmClock(0, true));
        System.out.println("alarmClock(3, true) → " + alarmClock(3, true));
    }
}
