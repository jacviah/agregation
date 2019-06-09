package by.jacviah.jc1.agregation_travel_vouchers.logic;

import by.jacviah.jc1.agregation_travel_vouchers.entity.Voucher;

import java.util.Comparator;

/**
 * Created by jacviah on 09.06.2019.
 */
public class ComparatorByDuration implements Comparator<Voucher> {
    @Override
    public int compare(Voucher o1, Voucher o2) {
        return o1.getDuration() - o2.getDuration();
    }
}
