package buchalka.section7.exercises.ex40;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe Burger", "weal", 15.11, "deluxe");
        super.addHamburgerAddition1("Chips", 2.55);
        super.addHamburgerAddition2("Drink", 1.44);
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("No additions can be added to deluxe burger");
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("No additions can be added to deluxe burger");
    }

    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additions can be added to deluxe burger");
    }

    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additions can be added to deluxe burger");
    }

}
