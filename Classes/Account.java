package Classes;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private int balance;
    private double interestRate;
    private final Date dateCreated;
    private Client client;
    private ArrayList<Transaction> transactions;

    public Account(int id, int balance, double interestRate, Client client) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
        this.client = client;

        this.transactions = new ArrayList<>();
        this.dateCreated = new Date();
    }

    public boolean withdraw(int amount) {
        if (balance >= amount) {
            this.balance -= amount;
            this.transactions.add(new Transaction('W', amount, balance, "Withdrawn " + amount));
            return true;
        }
        return false;
    }

    public void deposit(int amount) {
        this.balance += amount;
        this.transactions.add(new Transaction('D', amount, balance, "Deposited " + amount));
    }

    public int countTransactions(char type) {
        int count = 0;
        for (Transaction transaction: transactions) {
            if(transaction.getType() == type)
                count++;
        }
        return count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return this.id + " " + this.balance + " " + this.interestRate + " " + this.dateCreated + "\n" + this.transactions;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
