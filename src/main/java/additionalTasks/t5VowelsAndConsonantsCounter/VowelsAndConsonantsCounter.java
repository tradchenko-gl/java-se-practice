package additionalTasks.t5VowelsAndConsonantsCounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelsAndConsonantsCounter {
    private int vowelsCount;
    private int consCount;
    private static final List<String> vowels = Arrays.asList("a", "e", "i", "o", "u", "y");

    public VowelsAndConsonantsCounter(int vowelsCount, int consCount) {
        this.vowelsCount = vowelsCount;
        this.consCount = consCount;
    }

    private static boolean isVowel (char ch) {
        if(vowels.contains(String.valueOf(ch))) {
            return true;
        }
        return false;
    }

    private static boolean isConsonant(char ch) {
        if(!isVowel(ch)){
            if((int)ch >= 97 && (int)ch <= 122) {
                return true;
            }

        } return false;
    }
    public static int countVowels(String source) {
        int vowelsCount = 0;
        if(source != null) {
            source = source.toLowerCase();
            for (int i = 0; i < source.length(); i++) {
                if(isVowel(source.charAt(i))) {
                    vowelsCount++;
                }
            }
        }
        return vowelsCount;

    }

    public static int countConsonants (String source) {
        int consCount = 0;
        if(source != null) {
            source = source.toLowerCase();
            for (int i = 0; i < source.length(); i++) {
                if(isConsonant(source.charAt(i))) {
                    consCount++;
                }
            }
        }
        return consCount;
    }

    public static VowelsAndConsonantsCounter countVowelsAndConsonants (String source) {
        int vowelsCount = countVowels(source);
        int consCount = countConsonants(source);
        return new VowelsAndConsonantsCounter(vowelsCount, consCount);
    }

    public int getVowelsCount() {
        return vowelsCount;
    }

    public int getConsCount() {
        return consCount;
    }
}
