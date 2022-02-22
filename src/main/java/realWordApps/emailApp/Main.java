package realWordApps.emailApp;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Doe", Employee.Departments.ACCOUNTING);
        Employee employee2 = new Employee("Ben", "Stevenson", Employee.Departments.NONE);
        employee1.mailBox().setPassword("Password01");
        employee1.mailBox().setMailBoxCapacity(1000);
        employee1.mailBox().setAlternateEmailAddress("emil@test.com");

        System.out.println(employee1.mailBox().getEmailAddress());
        System.out.println(employee1.mailBox().getPassword());
        System.out.println(employee1.mailBox().getMailBoxCapacity());
        System.out.println(employee1.mailBox().getAlternateEmailAddress());


    }
}
