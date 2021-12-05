package section4.exercises;

public class Ex5DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2) {
        boolean areEqual = false;

        int intPartNumber1 = (int) number1;
        double decimalPartNumber1 = number1 - intPartNumber1;

        int intPartNumber2 = (int) number2;
        double decimalPartNumber2 = number2 - intPartNumber2;

        double decimalDifference = Math.abs(decimalPartNumber1 - decimalPartNumber2);

        if (intPartNumber1 != intPartNumber2) {
            areEqual = false;
        } else if (decimalDifference <= 0.0009) {
            areEqual = true;
        } else areEqual = false;

        return areEqual;
    }
}
