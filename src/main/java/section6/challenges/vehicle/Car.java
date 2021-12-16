package section6.challenges.vehicle;

public class Car extends Vehicle {
    private String model;
    private int horsePower;
    private boolean isCoupe;
    private double trunkSizeL;

    public Car(double maxSpeed, String model, int horsePower, boolean isCoupe, double trunkSizeL) {
        super(maxSpeed);
        this.horsePower = horsePower;
        this.model = model;
        this.isCoupe = isCoupe;
        this.trunkSizeL = trunkSizeL;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public boolean isCoupe() {
        return isCoupe;
    }

    public double getTrunkSizeL() {
        return trunkSizeL;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setCoupe(boolean coupe) {
        isCoupe = coupe;
    }

    public void setTrunkSizeL(double trunkSizeL) {
        this.trunkSizeL = trunkSizeL;
    }
}
