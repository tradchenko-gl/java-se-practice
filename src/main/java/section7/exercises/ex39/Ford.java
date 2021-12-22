package section7.exercises.ex39;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "The Ford engine starting";
    }

    public String accelerate() {
        return "The Ford is accelerating";
    }

    public String brake() {
        return "The Ford is breaking";
    }
}
