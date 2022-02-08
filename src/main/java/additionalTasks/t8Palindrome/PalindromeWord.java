package additionalTasks.t8Palindrome;

public class PalindromeWord {
    public static boolean isPalindrome (String s) {
        boolean isPalindrome = false;
        String reverseString = "";
        for (int i = s.length()-1; i>=0; i--) {
            reverseString += s.charAt(i);
        }
        if(s.equals(reverseString)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
