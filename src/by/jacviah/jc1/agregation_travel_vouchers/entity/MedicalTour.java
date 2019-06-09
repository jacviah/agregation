package by.jacviah.jc1.agregation_travel_vouchers.entity;

import java.util.Date;

public class MedicalTour extends Voucher {
    Country country;
    String licenseNumber;

    public MedicalTour(int price, Date startDate, Transport transport, Board board, int duration, Country country, String number) {
        super(price, startDate, transport, board, duration, VoucherType.MEDICAL_TOUR);
        this.country = country;
        this.licenseNumber = number;
    }

    public Country getCountry() {
        return country;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
}
