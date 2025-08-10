package String2;
public class catDog {
    /**
     * This method returns true if the number of times "cat"
     * appears in the input string equals the number of times "dog" appears.
     */
    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 3);
            if (sub.equals("cat")) {
                catCount++;
            }
            if (sub.equals("dog")) {
                dogCount++;
            }
        }

        return catCount == dogCount;
    }
    public static void main(String[] args) {
        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));
    }
}
