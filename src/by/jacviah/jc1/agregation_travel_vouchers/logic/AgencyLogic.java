package by.jacviah.jc1.agregation_travel_vouchers.logic;

import by.jacviah.jc1.agregation_travel_vouchers.entity.Client;
import by.jacviah.jc1.agregation_travel_vouchers.entity.SearchParameters;
import by.jacviah.jc1.agregation_travel_vouchers.entity.TravelAgency;
import by.jacviah.jc1.agregation_travel_vouchers.entity.Voucher;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class AgencyLogic {

    public ClientLogic authorization(String name, String password) {
        TravelAgency agency = TravelAgency.getInstance();
        Client client = agency.getClient(name, password);
        return new ClientLogic(client);
    }

    public void addClient(String name, String surname, String password) {
        TravelAgency agency = TravelAgency.getInstance();
        agency.addClient(name, surname, password);
    }

    public void addVoucher(Voucher voucher, int quantity) {
        TravelAgency agency = TravelAgency.getInstance();
        agency.addVoucher(voucher, quantity);
    }

    public List<Voucher> findVoucher(SearchParameters param) {
        TravelAgency agency = TravelAgency.getInstance();
        Set<Voucher> allVouchers = agency.getVouchers();
        List<Voucher> result = new ArrayList<>(allVouchers);

        if (param.getType() != null) {
            ListIterator<Voucher> iter = result.listIterator();
            while (iter.hasNext()) {
                if (!(iter.next().getType().equals(param.getType()))) {
                    iter.remove();
                }
            }
        }
        if (param.getDuration() != null) {
            ListIterator<Voucher> iter2 = result.listIterator();
            while (iter2.hasNext()) {
                if (!(iter2.next().getDuration() == param.getDuration())) {
                    iter2.remove();
                }
            }
        }
        if (param.getStart() != null) {
            ListIterator<Voucher> iter3 = result.listIterator();
            while (iter3.hasNext()) {
                if (!(iter3.next().getStartDate().equals(param.getStart()))){
                    iter3.remove();
                }
            }
        }
        if (param.getTransport() != null) {
            ListIterator<Voucher> iter4 = result.listIterator();
            while (iter4.hasNext()) {
                if (!(iter4.next().getTransport().equals(param.getTransport()))){
                    iter4.remove();
                }
            }
        }

        if (param.getMinPrice() != null & param.getMaxPrice() != null) {
            ListIterator<Voucher> iter5 = result.listIterator();
            while (iter5.hasNext()) {
                Voucher v = iter5.next();
                if (v.getPrice() < param.getMinPrice() | v.getPrice() > param.getMaxPrice()) {
                    iter5.remove();
                }
            }
        }
        return result;
    }

    public void decQuantityOrderedVoucher(int number) {
        TravelAgency agency = TravelAgency.getInstance();
        Voucher ordered = agency.getVoucher(number);
        Integer quantity = agency.getQuantity(ordered);
        quantity--;
        if (quantity == 0) {
            agency.removeVoucher(ordered);
        }
    }

}
