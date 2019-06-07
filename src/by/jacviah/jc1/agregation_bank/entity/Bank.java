package by.jacviah.jc1.agregation_bank.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Bank {

    private static Bank instance = new Bank();

    private HashMap<String, Client> clients = new HashMap<>();
    private Set<String> clientNumbers = new HashSet<>();

    private Bank() {
    }

    public static Bank getInstance() {
        return instance;
    }

    public Client getClient(String number) {
        for (String i : clientNumbers) {
            if (i.equals(number)) {
                return clients.get(number);
            }
        }
        System.out.println("Client not found.");
        return null;
    }

    public void addClient(String name, String surname, String number) {
        for (String i : clientNumbers) {
            if (i.equals(number)) {
                System.out.println("The Client " + name + " " + surname + " already exists.");
                break;
            }
        }
        clients.put(number, new Client(name, surname, number));
        clientNumbers.add(number);
        System.out.println("Client " + name + " " + surname + " was added.");
    }

    public void updateClient(Client client) {
        for (String i : clientNumbers) {
            if (i.equals(client.getIdentificationNumber())) {
                clients.put(client.getIdentificationNumber(), client);
                System.out.println("The Client " + client.getName() + " " + client.getSurname() + " was updated.");
            } else {
                System.out.println("The Client " + client.getName() + " " + client.getSurname() + " not found.");
            }
        }
    }

    public void deleteClient(Client client) {
        for (String i : clientNumbers) {
            if (i.equals(client.getIdentificationNumber())) {
                clients.remove(client.getIdentificationNumber());
                System.out.println("The Client " + client.getName() + " " + client.getSurname() + " was deleted.");
            } else {
                System.out.println("The Client " + client.getName() + " " + client.getSurname() + " not found.");
            }
        }
    }

    public ArrayList<Client> getClientsList() {
        ArrayList<Client> clients = new ArrayList<Client>();
        for (String i : clientNumbers) {
            clients.add(this.clients.get(i));
        }
        return clients;
    }
}
