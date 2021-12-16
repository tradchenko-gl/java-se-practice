package section6.challenges;

import java.util.PrimitiveIterator;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber () {
        return accountNumber;
    }

    public void setBalance (long balance) {
        this.balance = balance;
    }
    public double getBalance () {
        return this.balance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds (double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawFunds (double amount) {
        if (amount <= 0) {
            System.out.println("Amount is invalid");
        } else if (amount > this.balance) {
            System.out.println("Amount is greater than balance");
        } else this.balance -= amount;
    }
}
