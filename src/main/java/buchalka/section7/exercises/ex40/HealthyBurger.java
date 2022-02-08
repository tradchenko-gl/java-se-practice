package buchalka.section7.exercises.ex40;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double price = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            price += healthyExtra1Price;
            System.out.println("Added " + healthyExtra1Name + " for extra " + healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            price += healthyExtra2Price;
            System.out.println("Added " + healthyExtra2Name + " for extra " + healthyExtra2Price);
        }
        return price;
    }
}
