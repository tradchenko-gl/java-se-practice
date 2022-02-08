package additionalTasks;

import additionalTasks.t1DuplicateChars.CountDuplicateCharacters;
import additionalTasks.t2FirstNonRepeatingCharacter.FirstNonRepeatingCharacterInString;
import additionalTasks.t3ReverseString.ReverseString;
import additionalTasks.t4IfOnlyDigitsInString.IfOnlyDigitsInTheString;
import additionalTasks.t5VowelsAndConsonantsCounter.VowelsAndConsonantsCounter;

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

        //Code to test #3 - reverse string
        System.out.println("========= ex3 ==========");
        System.out.println(ReverseString.reverseString("string to reserse"));

        //Code to test #4 - if string contains only digits
        System.out.println("========= ex4 ==========");
        System.out.println(IfOnlyDigitsInTheString.isStringContainsOnlyDigits("12-397"));

        //Code to test #5 - count vowels and consonants
        System.out.println("========= ex5 ==========");
        System.out.println("Vowels: " + VowelsAndConsonantsCounter.countVowels("test string to count both"));
        System.out.println("Consonants: " + VowelsAndConsonantsCounter.countConsonants("test string to count both"));
        VowelsAndConsonantsCounter counter = VowelsAndConsonantsCounter.countVowelsAndConsonants("test string to count both");
        System.out.println("Vowels: " + counter.getVowelsCount() + "; Consonants: " + counter.getConsCount());



    }
}
