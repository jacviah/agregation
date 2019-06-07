package by.jacviah.jc1.agregation_bank.main;

import by.jacviah.jc1.agregation_bank.entity.Bank;
import by.jacviah.jc1.agregation_bank.logic.BankLogic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        init();

        Scanner sc = new Scanner(System.in);
        BankLogic logic = new BankLogic();
        out:
        while (true) {
            System.out.println("Enter action (0 - exit): " + "\n" +
                    "1 - add client" + "\n" +
                    "2 - find clients by name and surname" + "\n" +
                    "3 - find client accounts" + "\n" +
                    "4 - deposit balance" + "\n" +
                    "5 - withdraw balance" + "\n" +
                    "6 - view total balance" + "\n" +
                    "7 - view total balance (positive and negative separately)" + "\n" +
                    "8 - block account" + "\n" +
                    "9 -  unblock account" + "\n"
            );
            while (!sc.hasNext()) {
                System.out.println("Enter action:");
                sc.next();
            }
            String number = sc.next();
            String name;
            String surname;
            String idNumber;
            int acNumber;
            int value;


            switch (number) {
                case "0":
                    System.out.println("Exit");
                    break out;
                case "1":
                    System.out.println("Enter client name");
                    name = sc.next();
                    System.out.println("Enter client surname");
                    surname = sc.next();
                    System.out.println("Enter client identification number");
                    idNumber = sc.next();
                    logic.addClient(name, surname, idNumber);
                    break;
                case "2":
                    System.out.println("Enter client name");
                    name = sc.next();
                    System.out.println("Enter client surname");
                    surname = sc.next();
                    System.out.println(logic.findClient(name, surname));
                    break;
                case "3":
                    System.out.println("Enter identification number");
                    idNumber = sc.next();
                    System.out.println(logic.findClientAccounts(idNumber));
                    System.out.println(logic.sortAccountByBalane(logic.findClientAccounts(idNumber)));
                    break;
                case "4":
                    System.out.println("Enter identification number");
                    idNumber = sc.next();
                    System.out.println("Enter account number");
                    acNumber = sc.nextInt();
                    System.out.println("Enter value");
                    value = sc.nextInt();
                    logic.deposit(idNumber, acNumber, value);
                    break;
                case "5":
                    System.out.println("Enter identification number");
                    idNumber = sc.next();
                    System.out.println("Enter account number");
                    acNumber = sc.nextInt();
                    System.out.println("Enter value");
                    value = sc.nextInt();
                    logic.withdraw(idNumber, acNumber, value);
                    break;
                case "6":
                    System.out.println("Enter identification number");
                    idNumber = sc.next();
                    System.out.println(logic.getTotalBalance(idNumber));
                    break;
                case "7":
                    System.out.println("Enter identification number");
                    idNumber = sc.next();
                    System.out.println("Positive balance is " + logic.getPositiveBalance(idNumber));
                    System.out.println("Negative balance is " + logic.getNegativeBalance(idNumber));
                    break;
                case "8":
                    System.out.println("Enter identification number");
                    idNumber = sc.next();
                    System.out.println("Enter account number");
                    acNumber = sc.nextInt();
                    logic.blockAccount(idNumber, acNumber);
                    System.out.println("Client" + logic.findClient(idNumber).getName() + " " +
                            logic.findClient(idNumber).getSurname() + "account " + idNumber + " account is blocked");
                    break;
                case "9":
                    System.out.println("Enter identification number");
                    idNumber = sc.next();
                    System.out.println("Enter account number");
                    acNumber = sc.nextInt();
                    logic.unblockAccount(idNumber, acNumber);
                    System.out.println("Client" + logic.findClient(idNumber).getName() + " " +
                            logic.findClient(idNumber).getSurname() + "account " + idNumber + " account is blocked");
                    break;
                default:
                    System.out.println("Action is not resolved");
                    break;
            }
        }
    }

    public static void init() {

        BankLogic logic = new BankLogic();

        logic.addClient("Leonard", "Shelby", "LS105");
        logic.findClient("LS105").addAccount(100);
        logic.findClient("LS105").addAccount(400);
        logic.findClient("LS105").addAccount(-50);
        logic.findClient("LS105").addAccount(-140);
        logic.addClient("Leonard", "Shelby", "LS118");
        logic.findClient("LS118").addAccount(60);
        logic.findClient("LS118").addAccount(490);
        logic.findClient("LS118").addAccount(-30);
        logic.findClient("LS118").addAccount(-10);
        logic.addClient("Teddy", "Gammel", "TG687");
        logic.findClient("TG687").addAccount(20);
        logic.findClient("TG687").addAccount(-90);
        logic.findClient("TG687").addAccount(-3000);
        logic.addClient("Natalie", "_", "NB563");
        logic.findClient("NB563").addAccount(10);
        logic.findClient("NB563").addAccount(280);
        logic.findClient("NB563").addAccount(-20);
        logic.addClient("Joe", "Pantoliano", "JP636");
        logic.findClient("JP636").addAccount(40);
        logic.findClient("JP636").addAccount(80);
        logic.findClient("JP636").addAccount(-10);
        logic.addClient("Carrie-Anne", "MOSS", "CAM2000");
        logic.findClient("CAM2000").addAccount(10);
        logic.findClient("CAM2000").addAccount(230);
        logic.findClient("CAM2000").addAccount(-20);
    }
}
