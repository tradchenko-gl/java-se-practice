package additionalTasks.t9RemoveDuplicateChars;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateCharacters {

    public static String deleteDuplicateChar(char ch, String s) {
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                counter++;
                if(counter > 1) {
                    if (i == 0) {
                        s = s.substring(i + 1, s.length());
                    } else if (i == s.length() - 1) {
                        s = s.substring(0, i);
                    } else {
                        s = s.substring(0, i) + s.substring(i + 1, s.length());
                    }
                }
            }
        }
        return s;
    }

    public static String removeDuplicateChars(String s) {

        HashMap<Character, Integer> charsCount = new HashMap<>();
        if(s != null) {
            s = s.toLowerCase();
            //count number of every character
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(charsCount.containsKey(ch)) {
                    charsCount.put(ch, charsCount.get(ch)+1);
                } else {
                    charsCount.put(ch, 1);
                }
            }

            //remove repeating characters
            for(Map.Entry<Character, Integer> entry : charsCount.entrySet()) {
                if(entry.getValue() > 1) {
                    s = deleteDuplicateChar(entry.getKey(), s);
                }
            }
        }

        return s;

    }
}
