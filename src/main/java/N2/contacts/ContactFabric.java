package N2.contacts;

public interface ContactFabric {
    String saveAddress(String state, String street, String zip, String city);
    String savePhone(int phone);
}
