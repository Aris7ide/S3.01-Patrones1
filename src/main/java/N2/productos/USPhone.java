package N2.productos;

public class USPhone implements Phone{

    private final String prefix;
    private int phone;

    public USPhone(int phone) {
        this.prefix = "+1";
        this.phone = phone;
    }

    @Override
    public String phoneNumber(int number) {
        return prefix + " " + number;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
