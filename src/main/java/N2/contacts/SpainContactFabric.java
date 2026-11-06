package N2.contacts;

import N2.productos.Address;
import N2.productos.SpainAddress;
import N2.productos.SpainPhone;

public class SpainContactFabric implements ContactFabric {
    public String saveAddress(String state, String street, String zip, String city) {
        return new SpainAddress(state,street,zip,city).address();
    }

    public String savePhone(int phone) {
        return new SpainPhone(phone).phoneNumber();
    }
}
