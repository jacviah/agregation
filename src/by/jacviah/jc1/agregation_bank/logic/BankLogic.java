package by.jacviah.jc1.agregation_bank.logic;

import by.jacviah.jc1.agregation_bank.entity.Account;
import by.jacviah.jc1.agregation_bank.entity.Bank;
import by.jacviah.jc1.agregation_bank.entity.Client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class BankLogic {

    public void deposit(String clientNumber, int accountNumber, int value) {
        Bank connection = Bank.getInstance();
        connection.getClient(clientNumber).updateBalance(accountNumber, value);
    }

    public void withdraw(String clientNumber, int accountNumber, int value) {
        Bank connection = Bank.getInstance();
        connection.getClient(clientNumber).updateBalance(accountNumber, -value);
    }

    public void blockAccount(String clientNumber, int accountNumber) {
        Bank connection = Bank.getInstance();
        connection.getClient(clientNumber).blockAccount(accountNumber, true);
    }

    public void unblockAccount(String clientNumber, int accountNumber) {
        Bank connection = Bank.getInstance();
        connection.getClient(clientNumber).blockAccount(accountNumber, false);
    }

    public void addClient(String name, String surname, String number) {
        Bank connection = Bank.getInstance();
        connection.addClient(name, surname,number);
    }

    public Client findClient(String number){
        Bank connection = Bank.getInstance();
        return connection.getClient(number);
    }

    public Integer getTotalBalance(String number){
        Bank connection = Bank.getInstance();
        HashSet<Account> set = connection.getClient(number).getAccounts();
        int result = 0;
        for (Account i: set) {
            result+=i.getBalance();
        }
        return result;
    }

    public Integer getPositiveBalance(String number){
        Bank connection = Bank.getInstance();
        HashSet<Account> set = connection.getClient(number).getAccounts();
        int result = 0;
        for (Account i: set) {
            if (i.getBalance()>0) {
                result += i.getBalance();
            }
        }
        return result;
    }

    public Integer getNegativeBalance(String number){
        Bank connection = Bank.getInstance();
        HashSet<Account> set = connection.getClient(number).getAccounts();
        int result = 0;
        for (Account i: set) {
            if (i.getBalance()<0) {
                result += i.getBalance();
            }
        }
        return result;
    }

    public ArrayList<Client> findClient(String name, String surname){
        Bank connection = Bank.getInstance();
        ArrayList<Client> result = new ArrayList<>();
        ArrayList<Client> allClients = connection.getClientsList();
        for (Client i: allClients) {
            if (i.getName().equals(name)&i.getSurname().equals(surname)) {
                result.add(i);
            }
        }
        return result;
    }

    public ArrayList<Account> findClientAccounts(String number){
        Bank connection = Bank.getInstance();
        return new ArrayList<Account>(connection.getClient(number).getAccounts());
    }

    public ArrayList<Account> sortAccountByBalane(ArrayList<Account> list){
        Collections.sort(list, new AccountsComparatorByBalance());
        return list;
    }



}
