package buchalka.section6.challenges.vehicle;

public class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(double maxSpeed, String model, int horsePower, boolean isCoupe, double trunkSizeL, double batteryCapacity) {
        super(maxSpeed, model, horsePower, isCoupe, trunkSizeL);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
