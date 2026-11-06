package N2.contacts;

public class Contact {

    private String address;
    private String phone;

    public Contact(ContactFabric fabric, String state, String street, String zip, String city, int phone) {
        this.address = fabric.saveAddress(state, street, zip, city);
        this.phone = fabric.savePhone(phone);
    }

    public String showContact() {
        return address + "\n" + phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
