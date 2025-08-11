package String3;

public class notReplace {

        public static String notReplace(String str) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < str.length(); ) {
                // Check for "is"
                if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {
                    boolean before = (i > 0 && Character.isLetter(str.charAt(i - 1)));
                    boolean after = (i + 2 < str.length() && Character.isLetter(str.charAt(i + 2)));

                    if (!before && !after) {
                        result.append("is not");
                        i += 2;
                        continue;
                    }
                }
                // Add the current character if no valid "is" found
                result.append(str.charAt(i));
                i++;
            }
            return result.toString();
        }
        public static void main(String[] args) {
            // Test cases
            System.out.println(notReplace("is test"));
            System.out.println(notReplace("is-is"));
            System.out.println(notReplace("This is right"));
            System.out.println(notReplace("This isn't"));
            System.out.println(notReplace("his is his"));
        }
    }

