package Lesson5;

public class BankAccount {
    int id;
    String name;
    double balance;

    double popolnenieScheta ( double popolnenie) {
        balance += popolnenie;
        return balance;
    }

    double snytieSoScheta (double snyatie) {
        balance -= snyatie;
        return balance;
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.balance = 200.5;
        System.out.println(b1.popolnenieScheta(200));
        System.out.println(b1.snytieSoScheta(50));
    }
}