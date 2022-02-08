package additionalTasks.t6CharacterInTheString;

public class CharInTheString {

    public static int countCharInTheString(char ch, String s) {
        int count = 0;
        if(s != null) {
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ch) {
                    count++;
                }            }
            return count;
        }
        return -1;
    }
}
