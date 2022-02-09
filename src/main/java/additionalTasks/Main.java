package additionalTasks;

import additionalTasks.t10RemoveGivenChar.RemoveGivenChar;
import additionalTasks.t11CharsWithTheMostAppearence.PopularChars;
import additionalTasks.t1DuplicateChars.CountDuplicateCharacters;
import additionalTasks.t2FirstNonRepeatingCharacter.FirstNonRepeatingCharacterInString;
import additionalTasks.t11CharsWithTheMostAppearence.Pair;
import additionalTasks.t3ReverseString.ReverseString;
import additionalTasks.t4IfOnlyDigitsInString.IfOnlyDigitsInTheString;
import additionalTasks.t5VowelsAndConsonantsCounter.VowelsAndConsonantsCounter;
import additionalTasks.t6CharacterInTheString.CharInTheString;
import additionalTasks.t8Palindrome.PalindromeWord;
import additionalTasks.t9RemoveDuplicateChars.RemoveDuplicateCharacters;

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

        //Code to test #6 - count the occurrences of character in the string
        System.out.println("========= ex6 ==========");
        System.out.println(CharInTheString.countCharInTheString('q', "this is a string to test"));

        //Code to test #7 - TO IMPLEMENT
        System.out.println("========= ex7 ==========");

        //Code to test #8 - check is string is palindrome
        System.out.println("========= ex8 ==========");
        System.out.println(PalindromeWord.isPalindrome("cattac"));

        //Code to test #9 - remove duplicate characters
        System.out.println("========= ex9 ==========");
        System.out.println(RemoveDuplicateCharacters.removeDuplicateChars("dudplicate cdharactersd"));

        //Code to test #10 - remove given character
        System.out.println("========= ex10 ==========");
        System.out.println(RemoveGivenChar.removeChar('a', "a string toA remove a"));

        //Code to test #11 - find most repeated character
        System.out.println("========= ex11 ==========");
        Pair<Character, Integer> aChar = PopularChars.findMostRepeatedChar("whatcharisthemostpopularhere?");
        System.out.println(aChar.getCh() + ": " + aChar.getCount());

    }
}
