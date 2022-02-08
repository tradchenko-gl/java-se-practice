package buchalka.section6.exercises;

public class Ex34ComplexNumber {
    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Ex34ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add (double real, double imaginary) {
        this.real = real + getReal();
        this.imaginary = imaginary + getImaginary();

    }

    public void add (Ex34ComplexNumber number) {
        add(number.real, number.imaginary);
    }

    public void subtract (double real, double imaginary) {
        this.real = getReal() - real;
        this.imaginary = getImaginary() - imaginary;

    }

    public void subtract (Ex34ComplexNumber number) {
        subtract(number.real, number.imaginary);
    }
}
