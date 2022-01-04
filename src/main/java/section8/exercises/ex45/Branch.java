package section8.exercises.ex45;

import java.util.ArrayList;
import java.util.Arrays;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if(customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    public boolean newCustomer(String customerName, double transaction) {
        if(findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, transaction));
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for(int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName() == name) {
                return customers.get(i);
            }
        }
        return null;
    }
}
