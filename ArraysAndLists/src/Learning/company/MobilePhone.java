package Learning.company;
import java.util.ArrayList;

public class MobilePhone {

        private String myNumber;
        private ArrayList<Contact> myContacts;

        public MobilePhone(String myNumber) {
            this.myNumber = myNumber;
            this.myContacts = new ArrayList<Contact>();
        }

        public boolean addNewContact(Contact contact) {
            if (findContact(contact) == -1) {
                return myContacts.add(contact);
            } else {
                return false;
            }

        }

        public boolean updateContact(Contact oldContact, Contact newContact) {
            if (findContact(oldContact) > 0) {
                if (oldContact.getName().equals(newContact.getName())) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        public boolean removeContact(Contact contact) {
            if (findContact(contact) > 0) {
                if (myContacts.remove(contact)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        private int findContact(Contact contact) {
            return myContacts.indexOf(contact);
        }

        private int findContact(String contactName) {
            // Loop through myContacts elements.
            for(int i = 0; i < myContacts.size(); i++) {
                // Check if the name of i.th element of myContacts is equal to contactName.
                if (myContacts.get(i).getName().equals(contactName)) {
                    // Return the position/index of element of myContacts.
                    return i;
                }
            }
            return -1;
        }

        public Contact queryContact(String name) {
            for (int i = 0; i < myContacts.size(); i++) {
                if (myContacts.get(i).getName().equals(name)) {
                    return myContacts.get(i);
                }
            }
            return null;
        }

        public void printContacts() {
            System.out.println("Contact List :");
            for (int i = 0; i < myContacts.size(); i++) {
                System.out.println(i + 1 + "." + myContacts.get(i).getName() + "-> " + myContacts.get(i).getPhoneNumber());
            }
        }
}


