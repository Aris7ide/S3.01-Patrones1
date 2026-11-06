package N2.contacts;

import N2.service.ContactList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    ContactList contacts;
    ContactFabric spainFabric;
    ContactFabric USFabric;

    Contact spainContact;
    Contact USContact;

    @BeforeEach
    void setUp() {
        contacts = ContactList.instance();

        spainFabric = new SpainContactFabric();
        USFabric = new USContactFabric();

        spainContact = new Contact(spainFabric, "Spain", "Carrer de Lancaster", "08001","Barcelona", 691760715);
        USContact = new Contact(USFabric,"US","Rainbow St.", "ZI 4567","New York",568764567);
    }

    @AfterEach
    void tearDown() {
        contacts.clearList();
    }

    @Test
    void shouldSaveSpainContactCorrectly() {
        assertThat(spainContact.showContact().equalsIgnoreCase("Spain. Carrer de Lancaster, 08001, Barcelona\n" +
                "+34 691760715"));
    }

    @Test
    void shouldSaveUSContactCorrectly(){
        assertThat(USContact.showContact().equalsIgnoreCase("US: Rainbow St., New York ZI 4567\n" +
                "+1 568764567"));
    }

    @Test
    void shouldCreateContactListEmpty() {
        contacts.saveContact(spainContact);
        contacts.saveContact(USContact);

        assertThat(contacts.getContactList().size()).isEqualTo(2);
    }

    @Test
    void shouldNotInstanceAnotherContactList() {
        contacts.saveContact(spainContact);
        contacts.saveContact(USContact);

        assertThat(contacts.getContactList().size()).isEqualTo(2);

        ContactList contactsTest = ContactList.instance();

        assertThat(contactsTest.getContactList().size()).isEqualTo(2);
    }

}