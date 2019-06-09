package by.jacviah.jc1.agregation_travel_vouchers.logic;

import by.jacviah.jc1.agregation_travel_vouchers.entity.Client;
import by.jacviah.jc1.agregation_travel_vouchers.entity.TravelAgency;
import by.jacviah.jc1.agregation_travel_vouchers.entity.Voucher;

import java.util.Set;

public class ClientLogic {

    private Client user;

    public ClientLogic(Client user) {
        this.user = user;
    }


    public void booking(int number) {
        AgencyLogic agencyLogic = new AgencyLogic();
        TravelAgency agency = TravelAgency.getInstance();
        Set<Voucher> allVouchers = agency.getVouchers();
        int bookedNumber=-1;
        for (Voucher i : allVouchers) {
            if (i.getNumber() == number) {
                bookedNumber = i.getNumber();
                user.bookingVoucher(i, calculateDiscount());
            }
        }
        if (bookedNumber!=-1) {
            agencyLogic.decQuantityOrderedVoucher(bookedNumber);
        }
    }

    public void showInfo() {
        System.out.println("name - " + user.getName());
        System.out.println("surname - " + user.getSurname());
        System.out.println("orders - " + user.getOrders());
        System.out.println("spending - " + user.getSpending());
        System.out.println("discount - " + calculateDiscount());
    }

    private double calculateDiscount() {

        double amount = user.getSpending();
        if (amount >= 1000 & amount < 10000) {
            return 0.05;
        } else if (amount >= 10000) {
            return 0.12;
        } else {
            return 0;
        }
    }
}
