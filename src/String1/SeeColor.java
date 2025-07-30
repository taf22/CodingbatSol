package String1;

public class SeeColor {
    public static void main(String[] args) {
        System.out.println(seeColor("redxx"));       
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blueTimes"));
        System.out.println(seeColor("bl"));
        System.out.println(seeColor("red"));
        System.out.println(seeColor("blue"));
        System.out.println(seeColor(""));
    }

    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }
}
