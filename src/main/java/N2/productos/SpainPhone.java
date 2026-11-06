package N2.productos;

public class SpainPhone implements Phone {

    private final String prefix;
    private int  phone;

    public SpainPhone(int phone) {
        this.prefix = "+34";
        this.phone = phone;
    }

    @Override
    public String phoneNumber() {
        return prefix + " " + phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
