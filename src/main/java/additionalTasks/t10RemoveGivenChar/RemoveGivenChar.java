package additionalTasks.t10RemoveGivenChar;

public class RemoveGivenChar {

    public static String removeChar(char ch, String s) {
       s = s.toLowerCase();
       for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                if (i == 0) {
                   s = s.substring(i + 1, s.length());
                } else if (i == s.length() - 1) {
                   s = s.substring(0, i);
                } else {
                   s = s.substring(0, i) + s.substring(i + 1, s.length());
                }

            }
        }
        return s;
    }
}
