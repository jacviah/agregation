package by.jacviah.jc1.agregation_travel_vouchers.entity;

import java.util.Date;

public abstract class Voucher {
    {
        idGenerator++;
    }
    VoucherType type;
    private static int idGenerator=0;
    private int number = idGenerator;
    private int price;
    private Date startDate;
    private Transport transport;
    private Board board;
    private int duration;


    public Voucher(int price, Date startDate, Transport transport, Board board, int duration,  VoucherType type) {
        this.type = type;
        this.price = price;
        this.startDate = startDate;
        this.transport = transport;
        this.board = board;
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public VoucherType getType() {
        return type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Transport getTransport() {
        return transport;
    }

    public Board getBoard() {
        return board;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Voucher voucher = (Voucher) o;

        if (price != voucher.price) return false;
        if (duration != voucher.duration) return false;
        if (startDate != null ? !startDate.equals(voucher.startDate) : voucher.startDate != null) return false;
        if (transport != voucher.transport) return false;
        return board == voucher.board;

    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (transport != null ? transport.hashCode() : 0);
        result = 31 * result + (board != null ? board.hashCode() : 0);
        result = 31 * result + duration;
        return result;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "price=" + price +
                ", startDate=" + startDate +
                ", transport=" + transport +
                ", board=" + board +
                ", duration=" + duration +
                '}'+ "\n";
    }
}
