package by.jacviah.jc1.agregation_travel_vouchers.entity;

import java.util.Date;
import java.util.List;

public class Cruise extends Voucher {

    List<Country> countries;

    public Cruise(int price, Date startDate, Transport transport, Board board, int duration, List<Country> list) {
        super(price, startDate, transport, board, duration, VoucherType.CRUISE);
        countries = list;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
