package realWordApps.emailApp;

import java.util.Random;

public class Employee {
    private String firstName;
    private String lastName;
    private Departments department;
    private MailBox mailBox;
//    private String emailAddress;
//    private String password;
//    private long mailBoxCapacity;

    public enum Departments {
        SALES,
        DEVELOPMENT,
        ACCOUNTING,
        NONE
    }

    public Employee(String firstName, String lastName, Departments department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.mailBox = new MailBox();
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public MailBox mailBox() {
        return mailBox;
    }

    //    public void generateEmailAddress () {
//        String atCompany = "myCompany.com";
//        if(this.department == Departments.NONE) {
//            this.emailAddress = this.firstName + "." + this.lastName + "@" + atCompany;
//        } else {
//            this.emailAddress = this.firstName + "." + this.lastName + "@" + this.department.toString().toLowerCase() + "." + atCompany;
//        }
//    }
//
//
//    public String getEmailAddress() {
//        return emailAddress;
//    }
//
//    public boolean setMailBoxCapacity(long mailBoxCapacity) {
//        if(mailBoxCapacity > 0) {
//            this.mailBoxCapacity = mailBoxCapacity;
//            return true;
//        }
//        return false;
//    }

    public class MailBox {
        private String emailAddress;
        private String alternateEmailAddress;
        private String password;
        private long mailBoxCapacity;

        public MailBox () {
            this.emailAddress = generateEmailAddress();
            this.password = generateRandomString();
        }

        private String generateEmailAddress() {
            String email;
            if(department == Departments.NONE) {
                email = firstName + "." + lastName + "@" + "myCompany.com";
            } else {
                email = firstName + "." + lastName + "@" + department + ".myCompany.com";
            }
            return email;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setAlternateEmailAddress(String alternateEmailAddress) {
            this.alternateEmailAddress = alternateEmailAddress;
        }

        public void setMailBoxCapacity(long mailBoxCapacity) {
            this.mailBoxCapacity = mailBoxCapacity;
        }

        public String getAlternateEmailAddress() {
            return alternateEmailAddress;
        }

        public long getMailBoxCapacity() {
            return mailBoxCapacity;
        }

        private String generateRandomString () {
            int leftLimit = 48; // numeral '0'
            int rightLimit = 122; // letter 'z'
            int targetStringLength = 10;
            Random random = new Random();

            String generatedString = random.ints(leftLimit, rightLimit + 1)
                    .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                    .limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            return generatedString;
        }
    }
}
