package section8.exercises;

import section8.exercises.ex44.Contact;
import section8.exercises.ex44.MobilePhone;

public class Main {

    public static void main(String[] args) {
        Contact contact1 = new Contact("Bob", "123456789");
        Contact contact2 = new Contact("Sara", "111122233");
        Contact contact3 = new Contact("Pol", "111122233");
        Contact contact4 = new Contact("Steve", "333445566");
        Contact contact5 = new Contact("John", "55566775868");
        Contact contact6 = new Contact("Jason", "5556677990");

        MobilePhone myPhone = new MobilePhone("578-598-260");
        myPhone.addNewContact(contact1);
        myPhone.addNewContact(contact2);
        myPhone.addNewContact(contact3);
        myPhone.addNewContact(contact4);
        myPhone.addNewContact(contact5);

        myPhone.updateContact(contact1, contact6);

        myPhone.printContacts();

        System.out.println(myPhone.addNewContact(contact2));


    }
}
