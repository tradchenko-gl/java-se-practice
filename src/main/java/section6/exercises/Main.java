package section6.exercises;

public class Main {

    public static void main(String[] args) {
//        Point first = new Point(1, 1);
//        Point second = new Point(1,1);
//
//        System.out.println(first.distance(second) + " - distance from second for first");
//        System.out.println(first.distance() + " - distance from 0.0 to first");
//        System.out.println(first.distance(-1, -1) + " - distance from -1.-1 to first");
        Ex34ComplexNumber number1 = new Ex34ComplexNumber(1.0, 1.0);
        Ex34ComplexNumber number2 = new Ex34ComplexNumber(2.5, -1.5);
        number1.add(1, 1);
        System.out.println(number1.getReal() + " real; " + number1.getImaginary() + " imaginary");

    }
}
