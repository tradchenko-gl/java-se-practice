package buchalka.section8.exercises.ex45;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        Branch branch = findBranch(branchName);
        if(branch == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            if(branch.getCustomers().size() != 0) {
                for (int i = 0; i < branch.getCustomers().size(); i++) {
                    if(branch.getCustomers().get(i).getName() == customerName) {
                        return false;
                    } else {
                        branch.newCustomer(customerName, transaction);
                        return true;
                    }
                }
            } else {
                branch.newCustomer(customerName, transaction);
                return true;
            }
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch currentBranch = findBranch(branchName);
        if(currentBranch != null) {
            for (int i = 0; i < currentBranch.getCustomers().size(); i++) {
                if (currentBranch.getCustomers().get(i).getName() == customerName) {
                    currentBranch.getCustomers().get(i).addTransaction(transaction);
                    return true;
                }
            }
        }
        return false;
    }
    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer details for branch " + branchName);
            for(int i = 0; i < branch.getCustomers().size(); i++) {
                int customerIndex = i+1;
                System.out.println("Customer: " + branch.getCustomers().get(i).getName() + "[" + customerIndex + "]");
                if(printTransactions == true) {
                    System.out.println("Transactions");
                    for (int j = 0; j < branch.getCustomers().get(i).getTransactions().size(); j++) {
                        int transactionIndex = j+1;
                        System.out.println("[" + transactionIndex + "]  " + "Amount "
                                + branch.getCustomers().get(i).getTransactions().get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for(int i = 0; i < branches.size(); i++) {
            if(branches.get(i).getName() == branchName) {
                return branches.get(i);
            }
        }
        return null;
    }

}
