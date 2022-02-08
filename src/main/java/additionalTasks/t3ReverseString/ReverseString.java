package additionalTasks.t3ReverseString;

public class ReverseString {

    public static String reverseString(String stringToReverse) {
        String reversedString = "";
        if(stringToReverse != null) {
            for(int i = stringToReverse.length()-1; i >=0; i--) {
               reversedString += stringToReverse.charAt(i);
            }

        }        return reversedString;
    }
}
