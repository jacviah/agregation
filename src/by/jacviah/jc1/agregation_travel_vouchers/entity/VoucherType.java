package by.jacviah.jc1.agregation_travel_vouchers.entity;

public enum VoucherType {
    CRUISE("Cruise"),
    MEDICAL_TOUR("Medical tour"),
    SHOPPING("Shopping tour");

    private String printedText;
    private VoucherType(String str){
        printedText = str;
    }

    @Override
    public String toString() {
        return printedText;
    }
}
