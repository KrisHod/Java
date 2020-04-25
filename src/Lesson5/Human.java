package Lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount2 bA;

    void info() {
        System.out.println("Name: " + name + ", Color: " + car.color + ", Balance; " + bA.balance);
    }
}
class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Alex";
        h.car = new Car3("red", "V4");
        h.bA = new BankAccount2(18, 200.5);
        h.info();
    }
}

class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;
    }
    String color;
    String engine;
        }
class BankAccount2 {
    BankAccount2(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }
        int id;
        double balance;
}