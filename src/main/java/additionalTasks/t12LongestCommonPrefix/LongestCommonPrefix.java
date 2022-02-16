package additionalTasks.t12LongestCommonPrefix;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String findLongestCommonPrefix(String[] stringsArray) {
        String prefix = "";
        //sort the array
        Arrays.sort(stringsArray);
        String firstElement = stringsArray[0];
        String lastElement = stringsArray[stringsArray.length-1];

        //compare chars of the first element to chars of last element
        for(int i = 0; i < firstElement.length(); i++) {
            if (firstElement.charAt(i) == lastElement.charAt(i)) {
                prefix += firstElement.charAt(i);
            } else break;
        } return prefix;
    }
}
