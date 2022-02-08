package buchalka.section6.challenges.vehicle;

public class Vehicle {
    private double maxSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed < 0) {
            System.out.println("Invalid speed");
        } else this.maxSpeed = maxSpeed;
    }
}
