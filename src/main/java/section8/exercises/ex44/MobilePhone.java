package section8.exercises.ex44;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact newContact) {
        String name = newContact.getName();
        int index = findContact(name);
        if(index < 0) {
           myContacts.add(newContact);
           return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if(index >= 0) {
            myContacts.set(index, newContact);
            return true;
        } return false;
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if(index >= 0) {
            myContacts.remove(index);
            return true;
        } return false;
    }

    public int findContact(String searchParameter) {
        for(int i = 0; i < myContacts.size(); i++) {
            if((myContacts.get(i).getName() == searchParameter) || (myContacts.get(i).getPhoneNumber() == searchParameter)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String searchParameter) {
        for (int i = 0; i < myContacts.size(); i++) {
            if ((myContacts.get(i).getName() == searchParameter) || (myContacts.get(i).getPhoneNumber() == searchParameter)) {
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for(int i = 0; i < myContacts.size(); i++) {
            System.out.println(i+1 + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }
}
