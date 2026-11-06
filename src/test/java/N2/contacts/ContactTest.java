package N2.contacts;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {



    @Test
    void shouldSaveSpainContactCorrectly() {
        ContactFabric fabric = new SpainContactFabric();
        Contact contact = new Contact(fabric, "Spain", "Carrer de Lancaster", "08001","Barcelona", 691760715);

        assertThat(contact.showContact().equalsIgnoreCase("Spain. Carrer de Lancaster, 08001, Barcelona\n" +
                "+34 691760715"));
    }

    @Test
    void shouldSaveUSContactCorrectly(){
        ContactFabric fabric = new USContactFabric();
        Contact contact = new Contact(fabric,"US","Rainbow St.", "ZI 4567","New York",568764567);

        assertThat(contact.showContact().equalsIgnoreCase("US: Rainbow St., New York ZI 4567\n" +
                "+1 568764567"));
    }

}