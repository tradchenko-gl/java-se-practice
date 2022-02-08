package buchalka.section4.exercises;

public class Ex8AreaCalculator {

    public static double area (double radius) {
        double circleArea = -1;

        if (radius >=0) {
            circleArea = radius*radius*Math.PI;
        }

        return circleArea;
    }

    public static double area (double x, double y) {
        double rectangleArea = -1;

        if (x >= 0 && y >= 0) {
            rectangleArea = x*y;
        }

        return rectangleArea;
    }
}
