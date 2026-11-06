package N2.productos;

public class SpainAddress implements Address {

    private String state;
    private String street;
    private String zip;
    private String city;

    public SpainAddress(String state, String street, String zip, String city) {
        this.state = state;
        this.street = street;
        this.zip = zip;
        this.city = city;
    }

    @Override
    public String address() {
        return state +". " + street + ", " + zip + ", " + city;
    }
}
