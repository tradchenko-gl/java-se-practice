package buchalka.section7.exercises.ex39;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
       return "The Mitsubishi engine starting";
    }

    public String accelerate() {
        return "The Mitsubishi is accelerating";
    }

    public String brake() {
        return "The Mitsubishi is breaking";
    }
}

