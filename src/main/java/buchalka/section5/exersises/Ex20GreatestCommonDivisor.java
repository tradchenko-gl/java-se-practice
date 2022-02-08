package buchalka.section5.exersises;

public class Ex20GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second) {

        if ((first >= 10) && (second >= 10)) {
            int minValue = Math.min(first, second);
            for (int i = minValue; i > 0; i--) {
                if ((first % i == 0) && (second % i == 0)) {
                    return i;
                }
            }
        } return -1;
    }
}
