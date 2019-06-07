package by.jacviah.jc1.agregation_bank.entity;

public class Account {

    private Integer number;
    private int balance;
    private boolean isBlocked;

    public Account(int number, int balance) {
        this.number = number;
        this.balance = balance;
        this.isBlocked = false;
    }

    public Integer getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public void updateBalance(int value) {
        this.balance += value;
    }


    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
         isBlocked = blocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return number != null ? number.equals(account.number) : account.number == null;

    }

    @Override
    public int hashCode() {
        return number != null ? number.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", balance=" + balance +
                ", isBlocked=" + isBlocked +
                '}';
    }
}
