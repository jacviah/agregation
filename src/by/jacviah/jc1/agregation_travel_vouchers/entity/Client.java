package by.jacviah.jc1.agregation_travel_vouchers.entity;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String surname;
    private String password;
    private double spending;
    private List<Voucher> orders = new ArrayList<>();

    public Client(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
    }


    public void bookingVoucher(Voucher voucher, double discount) {

       orders.add(voucher);
       setSpending(getSpending() + voucher.getPrice()-  discount * voucher.getPrice());

    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean checkPassword(String pass) {
        if (pass.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public double getSpending() {
        return spending;
    }

    public List<Voucher> getOrders() {
        return orders;
    }

    private void setSpending(double spending) {
        this.spending = spending;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        return password != null ? password.equals(client.password) : client.password == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
