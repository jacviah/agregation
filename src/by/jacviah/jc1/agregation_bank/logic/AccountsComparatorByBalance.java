package by.jacviah.jc1.agregation_bank.logic;

import by.jacviah.jc1.agregation_bank.entity.Account;

import java.util.Comparator;

public class AccountsComparatorByBalance implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        return o1.getBalance()-o2.getBalance();
    }
}
