package by.jacviah.jc1.agregation_travel_vouchers.entity;

import java.util.Date;

public class Shopping extends Voucher {
    Country country;
    int baggage;

    public Shopping(int price, Date startDate, Transport transport, Board board, int duration, Country country, int baggage) {
        super(price, startDate, transport, board, duration, VoucherType.SHOPPING);
        this.country = country;
        this.baggage = baggage;
    }

    public Country getCountry() {
        return country;
    }

    public int getBaggage() {
        return baggage;
    }
}
