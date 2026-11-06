package N2.service;

import N2.contacts.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactList {

    private static ContactList contacts;
    private List<Contact> contactList;

    private ContactList() {
        contactList = new ArrayList<>();
    }

    public static ContactList instance(){
        if (contacts==null){
            contacts = new ContactList();
        }
        return contacts;
    }

    public void saveContact(Contact contact){
        contactList.add(contact);
    }

    public void clearList() {
        this.contactList.clear();
    }

    public static ContactList getContacts() {
        return contacts;
    }

    public static void setContacts(ContactList contacts) {
        ContactList.contacts = contacts;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}
