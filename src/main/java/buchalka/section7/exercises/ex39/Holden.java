package buchalka.section7.exercises.ex39;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "The Holden engine starting";
    }

    public String accelerate() {
        return "The Holden is accelerating";
    }

    public String brake() {
        return "The Holden is breaking";
    }
}
