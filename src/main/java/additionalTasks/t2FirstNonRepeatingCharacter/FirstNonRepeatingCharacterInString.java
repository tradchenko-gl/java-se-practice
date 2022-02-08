package additionalTasks.t2FirstNonRepeatingCharacter;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterInString {

    public static char firstNonRepeatingCharacter(String source) {
        //HashMap to store characters and its counters:
        LinkedHashMap<Character, Integer> charsCount = new LinkedHashMap<>();
        if(source != null) {
            char charArr[] = source.toCharArray();
            for(int i = 0; i < charArr.length; i++) {
                // if there is a character in hashmap - update the counter value;
                if(charsCount.containsKey(charArr[i])) {
                    charsCount.put(charArr[i], charsCount.get(charArr[i]) + 1);
                } //if there is no such character in hashmap - add it
                else {
                    charsCount.put(charArr[i], 1);
                }
            }
        }
        //get the first character with counter == 1;
        if(charsCount != null) {
            for(Map.Entry<Character, Integer> entry : charsCount.entrySet()) {
                if(entry.getValue() == 1) {
                    return entry.getKey();
                }
            }
        }
        return 0;
    }

    public static char firstNonRepeatingCharV2(String source) {
        if(source != null) {
            source = source.toLowerCase();
            for(int i = 0; i < source.length(); i++) {
                if(source.indexOf(source.charAt(i)) == source.lastIndexOf(source.charAt(i))) {
                    return source.charAt(i);
                }
            }
        }
        return 0;
    }
}
