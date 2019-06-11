package by.jacviah.jc1.agregation_travel_vouchers.main;


import by.jacviah.jc1.agregation_travel_vouchers.entity.*;
import by.jacviah.jc1.agregation_travel_vouchers.logic.AgencyLogic;
import by.jacviah.jc1.agregation_travel_vouchers.logic.ClientLogic;
import by.jacviah.jc1.agregation_travel_vouchers.logic.ComparatorByDuration;
import by.jacviah.jc1.agregation_travel_vouchers.logic.ComparatorByPrice;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        init();
        AgencyLogic agencyLogic = new AgencyLogic();

/*      search

        SearchParameters param1 = new SearchParameters(VoucherType.MEDICAL_TOUR, 900, 1100, null,null,null);
        List<Voucher> list1 = agencyLogic.findVoucher(param1);
        printList(list1, new ComparatorByPrice());
        SearchParameters param2 = new SearchParameters(VoucherType.MEDICAL_TOUR, null,null,9, null,Transport.AIRPLANE);
        List<Voucher> list2 = agencyLogic.findVoucher(param2);
        printList(list2, new ComparatorByDuration());
*/

        //authorization
        ClientLogic clientLogic = agencyLogic.authorization("Vaclav", "pass1");
        System.out.println("booking number 8");

        //booking
        SearchParameters param3 = new SearchParameters(VoucherType.MEDICAL_TOUR, null,null,9, new Date(2019, 6, 16),Transport.AIRPLANE);
        List<Voucher> list3 = agencyLogic.findVoucher(param3);
        list3 = agencyLogic.findVoucher(param3);
        printList(list3, new ComparatorByDuration());
        clientLogic.booking(8);
        System.out.println("number 8 was booked");
        list3 = agencyLogic.findVoucher(param3);
        printList(list3, new ComparatorByDuration());
        clientLogic.booking(5);
        clientLogic.booking(14);
        clientLogic.showInfo();

    }

    public static void init() {
        AgencyLogic agencyLogic = new AgencyLogic();
        List<Country> countries = Arrays.asList(Country.values());
        agencyLogic.addVoucher(new Cruise(1200, new Date(2019, 6, 12), Transport.SHIP, Board.HB, 14, countries), 5);
        agencyLogic.addVoucher(new Cruise(1000, new Date(2019, 6, 19), Transport.SHIP, Board.HB, 11, countries), 8);
        agencyLogic.addVoucher(new Cruise(1600, new Date(2019, 6, 25), Transport.SHIP, Board.FB, 16, countries), 3);
        agencyLogic.addVoucher(new Cruise(1200, new Date(2019, 6, 26), Transport.SHIP, Board.HB, 14, countries), 7);
        agencyLogic.addVoucher(new Cruise(1400, new Date(2019, 6, 29), Transport.SHIP, Board.HB, 15, countries), 4);
        agencyLogic.addVoucher(new MedicalTour(900, new Date(2019, 6, 11), Transport.TRAIN, Board.FB, 9, Country.TURKEY, "SA145"), 2);
        agencyLogic.addVoucher(new MedicalTour(1100, new Date(2019, 6, 13), Transport.BUS, Board.BB, 9, Country.GREECE, "SG123"), 3);
        agencyLogic.addVoucher(new MedicalTour(1600, new Date(2019, 6, 16), Transport.AIRPLANE, Board.FB, 9, Country.GREECE, "SG123"), 1);
        agencyLogic.addVoucher(new MedicalTour(1200, new Date(2019, 6, 14), Transport.TRAIN, Board.FB, 14, Country.TURKEY, "SA145"), 2);
        agencyLogic.addVoucher(new MedicalTour(1500, new Date(2019, 6, 16), Transport.AIRPLANE, Board.HB, 10, Country.FRANCE, "SR5"), 1);
        agencyLogic.addVoucher(new MedicalTour(1200, new Date(2019, 6, 14), Transport.AIRPLANE, Board.HB, 12, Country.SPAIN, "ST321"), 1);
        agencyLogic.addVoucher(new MedicalTour(600, new Date(2019, 6, 21), Transport.AIRPLANE, Board.FB, 9, Country.PORTUGAL, "FD245"), 1);
        agencyLogic.addVoucher(new Shopping(400, new Date(2019, 6, 9), Transport.BUS, Board.BB, 7, Country.TURKEY, 90), 3);
        agencyLogic.addVoucher(new Shopping(600, new Date(2019, 6, 13), Transport.BUS, Board.BB, 5, Country.TURKEY, 90), 5);
        agencyLogic.addVoucher(new Shopping(800, new Date(2019, 6, 11), Transport.BUS, Board.BB, 3, Country.FRANCE, 40), 5);
        agencyLogic.addVoucher(new Shopping(700, new Date(2019, 6, 16), Transport.TRAIN, Board.HB, 2, Country.FRANCE, 30), 9);
        agencyLogic.addVoucher(new Shopping(800, new Date(2019, 6, 19), Transport.BUS, Board.BB, 3, Country.FRANCE, 50), 11);
        agencyLogic.addClient("Vaclav", "Havel", "pass1");
        agencyLogic.addClient("Helmut", "Kohl", "pass2");
    }

    public static void printList(List<Voucher> list, Comparator<Voucher> comparator) {
        Collections.sort(list, comparator);
        for (Voucher i : list) {
            print(i);
        }
    }

    public static void print(Voucher v) {
        System.out.println("Type - " + v.getType());
        System.out.println("Number - " + v.getNumber());
        System.out.println("Price - " + v.getPrice());
        System.out.println("Duration - " + v.getDuration());
        System.out.println("Start - " + v.getStartDate());
        System.out.println("Transport - " + v.getTransport());
        if (v.getType().equals(VoucherType.CRUISE)) {
            System.out.println("Countries - " + ((Cruise) v).getCountries());
        }
        if (v.getType().equals(VoucherType.MEDICAL_TOUR)) {
            System.out.println("Country - " + ((MedicalTour) v).getCountry());
            System.out.println("License number - " + ((MedicalTour) v).getLicenseNumber());
        }
        if (v.getType().equals(VoucherType.SHOPPING)) {
            System.out.println("Country - " + ((Shopping) v).getCountry());
            System.out.println("Baggage - " + ((Shopping) v).getBaggage());
        }
        System.out.println("___________________________________________");
    }
}
