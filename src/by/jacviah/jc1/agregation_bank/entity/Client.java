package by.jacviah.jc1.agregation_bank.entity;

import java.util.ArrayList;
import java.util.HashSet;

public class Client {

    private String name;
    private String surname;
    private String identificationNumber;
    private HashSet<Account> accounts = new HashSet<>();
    private int accountNumber;


    public Client(String name, String surname, String number) {
        this.name = name;
        this.surname = surname;
        this.identificationNumber = number;
        this.accountNumber = 0;
    }


    public void addAccount(int balance) {
        accounts.add(new Account(accountNumber++, balance));
    }

    public void updateBalance(int number, int balance) {
        for (Account i : accounts) {
            if (number == i.getNumber()) {
                i.updateBalance(balance);
            }
        }
    }

    public void blockAccount(int number, boolean block) {
        for (Account i : accounts) {
            if (number == i.getNumber()) {
                i.setBlocked(block);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public HashSet<Account> getAccounts() {
        return accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        if (surname != null ? !surname.equals(client.surname) : client.surname != null) return false;
        return identificationNumber != null ? identificationNumber.equals(client.identificationNumber) : client.identificationNumber == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (identificationNumber != null ? identificationNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", identificationNumber='" + identificationNumber + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
