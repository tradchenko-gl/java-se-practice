package section4.challeges;

public class Ch2MethodOverloading {

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        double centimeters = -1;
        double feetToInches = feet*12;


        if (feet >= 0 && inches >=0 && inches <= 12) {
            centimeters = (inches + feetToInches)*2.54;
        }

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        double centimeters = -1;
        double newInches;
        double feet;

        if (inches >= 0) {
            feet = Math.round(inches/12);
            newInches = inches%12;

            centimeters = calcFeetAndInchesToCentimeters(feet, newInches);

        }

        return centimeters;
    }
}
