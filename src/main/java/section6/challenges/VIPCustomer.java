package section6.challenges;

public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VIPCustomer () {
        this("Default Name", 10000.00, "default@email.com");
    }

    public VIPCustomer (String name, String emailAddress) {
        this(name, 10000.00, emailAddress);
    }

    public VIPCustomer (String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
