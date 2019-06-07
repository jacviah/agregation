package by.jacviah.jc1.agregation_text.entity;

public enum Sign {
    DOT("."),
    EXCLAMATION_MARK ("!"),
    QUESTION_MARK("?");

    String sign;

    Sign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
}
