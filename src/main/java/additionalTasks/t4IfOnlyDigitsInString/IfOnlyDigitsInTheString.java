package additionalTasks.t4IfOnlyDigitsInString;

public class IfOnlyDigitsInTheString {

    public static boolean isStringContainsOnlyDigits(String source) {
        boolean isAllDigits = true;
        if (source != null) {
            for(int i = 0; i < source.length(); i++) {
                int codePoint = source.codePointAt(i);
                if (codePoint < 48 || codePoint > 57) {
                    isAllDigits = false;
                }
            }
        } else return false;
        return isAllDigits;
    }
}
