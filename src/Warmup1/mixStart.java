package Warmup1;


public class mixStart {

    public static void main(String[] args) {
        // Test cases for the mixStart function
        System.out.println(mixStart("mix")); // true
        System.out.println(mixStart("pix")); // true
        System.out.println(mixStart("piz")); // false
        System.out.println(mixStart("ax"));  // false
        System.out.println(mixStart("ix"));  // false
    }

    public static boolean mixStart(String str) {
        // Check if string is too small (so substring() below does not go off the end)
        if (str.length() < 3) return false;

        // Pull out length 2 string for the "ix" part
        // (i.e. substring starting at index 1 and stopping just before 3)
        String two = str.substring(1, 3);

        // Check if it matches "ix"
        return two.equals("ix");
    }
}
