package by.jacviah.jc1.agregation_travel_vouchers.logic;

import by.jacviah.jc1.agregation_travel_vouchers.entity.Voucher;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Voucher> {
    @Override
    public int compare(Voucher o1, Voucher o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
