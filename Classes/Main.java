package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        RECTANGLE EXERCISE

//        Rectangle rect = new Rectangle();
//        System.out.println(rect.getWidth());
//        System.out.println(rect.getHeight());
//        System.out.println(rect.getArea());
//        System.out.println(rect.getPerimeter());
//
//        rect.setWidth(5);
//        rect.setHeight(4);
//
//        System.out.println(rect.getArea());
//        System.out.println(rect.getPerimeter());

//        Rectangle[] rectArr = new Rectangle[3];
//        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < rectArr.length; i++) {
//            double w = in.nextDouble();
//            double h = in.nextDouble();
//            rectArr[i] = new Rectangle(w,h);
//        }
//
//        for (int i = 0; i < rectArr.length; i++) {
//            System.out.println(rectArr[i].getArea());
//            System.out.println(rectArr[i].getPerimeter());
//        }


//        ACCOUNT EXERCISE
//        Account testAccount = new Account(1122, 20000, 4.5);
//        if (testAccount.withdraw(2500))
//            System.out.println("Withdraw successful");
//        else
//            System.out.println("Withdraw not successful");
//
//        testAccount.deposit(3000);
//
//        System.out.println(testAccount.getId() + " " + testAccount.getBalance() + " " + testAccount.getInterestRate() + " " + testAccount.getDateCreated());


//        CLIENT EXERCISE

//        Client[] clients = new Client[2];
//
//        clients[0] = new Client(1,"Suhail","7006386057");
//        clients[0].addAccount(new Account(1,50000,17));
//        clients[0].addAccount(new Account(2,70000,23));
//
//        clients[1] = new Client(2,"Aamir","7006057248");
//        clients[1].addAccount(new Account(3,50000,17));
//        clients[1].addAccount(new Account(4,70000,23));
//        clients[1].addAccount(new Account(5,90000,27));
//
//
//        System.out.println("Client 1: " + " " + clients[0].toString());
//        System.out.println("Client 2: " + " " + clients[1].toString());
//
//
//        clients[0].removeAccount(1);
//        clients[1].removeAccount(4);
//
//        System.out.println("Client 2: " + " " + clients[0]);
//        System.out.println("Client 2: " + " " + clients[1]);


//        TRANSACTION EXERCISE

        ArrayList<Account> accounts = new ArrayList<>();

        Client client = new Client(100, "Ali", "1234567890");

        accounts.add(new Account(1, 1000, 1.5, client));
        accounts.add(new Account(2, 2000, 2.5, client));

        for (Account account : accounts) {
            System.out.println("Account" + account.getId() + ":");
            System.out.println("W:" + account.countTransactions('W'));
            System.out.println("D:" + account.countTransactions('D'));
        }

        accounts.get(0).withdraw(2500);
        accounts.get(0).deposit(3000);

        accounts.get(1).deposit(30000);
        accounts.get(1).withdraw(2500);

        for (Account account : accounts) {
            System.out.println("Account" + account.getId() + ":");
            System.out.println("W:" + account.countTransactions('W'));
            System.out.println("D:" + account.countTransactions('D'));
        }

        accounts.get(0).withdraw(2500);
        accounts.get(0).deposit(3000);

        accounts.get(1).deposit(30000);
        accounts.get(1).withdraw(2500);

        System.out.println(accounts.get(0));
        System.out.println(accounts.get(1));

    }
}
