package additionalTasks.t11CharsWithTheMostAppearence;

import java.util.HashMap;
import java.util.Map;

public class PopularChars {

//    private static HashMap<Character, Integer> sort(HashMap<Character, Integer> mapToSort) {
//        if(!mapToSort.isEmpty()) {
//            Collections.sort();
//        }
//    }

    public static Pair<Character, Integer> findMostRepeatedChar(String s) {
    HashMap<Character, Integer> charsCount = new HashMap<>();

    if(s != null) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(charsCount.containsKey(ch)) {
                charsCount.put(ch, charsCount.get(ch) + 1);
            } else {
                charsCount.put(ch, 1);
            }
        }
    }
    return findMax(charsCount);
    }

    private static Pair<Character, Integer> findMax(HashMap <Character, Integer> charsMap) {
        int maxCount = 0;
        char maxChar = 0;

        for(Map.Entry<Character, Integer> entry : charsMap.entrySet()) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        } return new Pair<Character, Integer>(maxChar, maxCount);
    }
}
