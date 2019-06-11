package by.jacviah.jc1.agregation_travel_vouchers.entity;

import java.util.*;

public class TravelAgency {
    public static final TravelAgency instance = new TravelAgency();

    Set<Client> clients = new HashSet<>();
    Map<Voucher, Integer> vouchers = new HashMap<>();

    private TravelAgency() {
    }

    public static TravelAgency getInstance() {
        return instance;
    }

    public Client getClient(String name, String password) {
        for (Client i : clients) {
            if (i.getName().equals(name) & i.checkPassword(password)) {
                return i;
            }
        }
        return null;
    }

    public void addClient(String name, String surname, String password) {
        Client client = new Client(name,surname,password);
        clients.add(client);
    }

    public Set<Voucher> getVouchers() {
        return vouchers.keySet();
    }

    public Voucher getVoucher(int number) {
        Set<Voucher> all = vouchers.keySet();
        for (Voucher i: all) {
            if (i.getNumber() == number) {
                return i;
            }
        }
        return null;
    }

    public Integer getQuantity(Voucher v) {
        return vouchers.get(v);
    }
    public void addVoucher(Voucher v, int quantity) {
        vouchers.put(v, quantity);
    }
    public void removeVoucher(Voucher v) {
        vouchers.remove(v);
    }
}
