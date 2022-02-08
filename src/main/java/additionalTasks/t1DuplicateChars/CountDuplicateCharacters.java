package additionalTasks.t1DuplicateChars;

import java.util.Arrays;
import java.util.HashMap;

public class CountDuplicateCharacters {

    public static HashMap<String, Integer> countDuplicateChars(String source) {
        HashMap<String, Integer> duplicateCharacters = new HashMap<>();
        if(source != null) {
            //All characters to lower case and split the string to characters, store in the array
            source = source.toLowerCase();
            String charsArr[] = source.split("");

            //counter to count repeated characters
            int counter = 1;

            //sort the array
            Arrays.sort(charsArr);
            int i = 0;
            while (i < charsArr.length - 1) {
                String temp = charsArr[i];
                //compare character with remaining characters
                for (int j = i+1; j < charsArr.length; j++) {
                    if(charsArr[i].equals(charsArr[j])) {
                        counter++;
                    } else {
                        i = j;
                        break;
                    } if (j == charsArr.length -1 ) {
                        i = j;
                    }
                }
                if(counter > 1) {
                    duplicateCharacters.put(temp, counter);
                    counter = 1;
                }
            }
        }
        return duplicateCharacters;
    }
}
