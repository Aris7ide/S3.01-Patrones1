package N2.contacts;

import N2.productos.USAddress;
import N2.productos.USPhone;

public class USContactFabric implements ContactFabric {
    public String saveAddress(String state, String street, String zip, String city) {
        return new USAddress(state,street,zip,city).address();
    }

    public String savePhone(int phone) {
        return new USPhone(phone).phoneNumber();
    }
}
