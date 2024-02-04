package Classes;

import java.util.Date;

public class Transaction {
    private char type; // W, D
    private double amount;
    private double balance;
    private Date date;
    private String description;

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public String toString() {
        return "Transaction{" +
                "type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;

        this.date = new Date();
    }
}
