package additionalTasks;

import additionalTasks.t1DuplicateChars.CountDuplicateCharacters;
import additionalTasks.t2FirstNonRepeatingCharacter.FirstNonRepeatingCharacterInString;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Code to test #1
        System.out.println("========= ex1 ==========");
        HashMap<String, Integer> result = CountDuplicateCharacters.countDuplicateChars("This is sTring to count");
        result.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        //Code to test #2 - find first non repeating character in the string
        System.out.println("========= ex2 ==========");
        System.out.println(FirstNonRepeatingCharacterInString.firstNonRepeatingCharacter("strinsgt"));
        System.out.println(FirstNonRepeatingCharacterInString.firstNonRepeatingCharV2("string to test r"));

    }
}
