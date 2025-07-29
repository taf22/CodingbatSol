package Warmup1;

public class nearHundred {
    public static void main(String[] args) {
        nearHundred obj = new nearHundred();

        System.out.println(obj.nearHundred(93));   // true
        System.out.println(obj.nearHundred(90));   // true
        System.out.println(obj.nearHundred(89));   // false
        System.out.println(obj.nearHundred(110));  // true
        System.out.println(obj.nearHundred(190));  // true
        System.out.println(obj.nearHundred(209));  // true
        System.out.println(obj.nearHundred(210));  // true
    }

    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }
}
