package by.jacviah.jc1.agregation_travel_vouchers.entity;

import java.util.Date;

public class SearchParameters {
    VoucherType type;
    Integer minPrice;
    Integer maxPrice;
    Integer duration;
    Date start;
    Transport transport;

    public SearchParameters(VoucherType type, Integer minPrice, Integer maxPrice, Integer duration, Date start, Transport transport) {
        this.type = type;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.duration = duration;
        this.start = start;
        this.transport = transport;
    }

    public VoucherType getType() {
        return type;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public Integer getDuration() {
        return duration;
    }

    public Date getStart() {
        return start;
    }

    public Transport getTransport() {
        return transport;
    }
}
