package Lesson24;

import java.security.SecureRandom;

public abstract class Animal {
   String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal{

    public Fish(String name) {
        super(name);
        this.name=name;
    }

    public void sleep(){
        System.out.println("It's always interesting to observe how the fish is sleeping");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable{

    public Bird(String name) {
        super(name);
        this.name=name;
    }
    public void speak(){
        System.out.println(name + "signs");
    }

    abstract void fly();
}

abstract class Mammal extends Animal implements Speakable{

    public Mammal(String name) {
        super(name);
        this.name=name;
    }

    abstract void run ();
}

interface Speakable {
    default void speak(){
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish{
    public Mechenosec (String name){
        super(name);
        this.name=name;
    }
    public void swim(){
        System.out.println("Mechenosec krasivaya riba");
    }
    public void eat(){
        System.out.println("Mechenosec ne hishnaya riba");
    }
}

class Penguin extends Bird {
    public Penguin (String name){
        super(name);
        this.name=name;
    }
    public void eat(){
        System.out.println("Penguin likes to eat the fish");
    }
    public void sleep(){
        System.out.println("The penguins sleep close together");
    }
    public void fly(){
        System.out.println("The penguins cannot fly");
    }
    public void speak(){
        System.out.println("The penguins cannot sing");
    }
}

class Lion extends Mammal{
    public Lion (String name){
        super(name);
        this.name=name;
    }
    public void eat(){
        System.out.println("The lions like meat");
    }
    public void sleep(){
        System.out.println("The lions sleep a lot");
    }
    public void run(){
        System.out.println("The lions aren't the biggest cat");
    }
}

class Lesson24{
    public static void main(String[] args) {
//        Mechenosec mech = new Mechenosec("Sharp");
//        System.out.println(mech.name);
//        mech.swim();
//        mech.eat();
//        mech.sleep();
//
//        Speakable pen = new Penguin("Jora");
//        pen.speak();
//
//        Animal lev = new Lion("Vasya");
//        System.out.println(lev.name);
//        lev.eat();
//        lev.sleep();
//
//        Mammal lev2 = new Lion("Simba");
//        System.out.println(lev2.name);
//        lev2.eat();
//        lev2.sleep();
//        lev2.run();

        Speakable sp1 = new Penguin("Kyzya");
        Speakable sp2 = new Lion("Simba");
        Animal an1 = new Mechenosec("Riba");
        Animal an2 = new Penguin("Jora");
        Animal an3 = new Lion("Hector");
        Fish f1 = new Mechenosec("Gupi");
        Mammal m1 = new Lion("Simba2");
        Bird b1 = new Penguin("JyJa");
        Mechenosec mech = new Mechenosec("Luba");
        Penguin pen = new Penguin("Dysya");
        Lion l = new Lion("Kolya");

        Speakable[] array = {sp1, sp2, b1, m1, pen, l};
        Animal[] array2 = {an1, an2, an3, f1, m1, b1, mech, pen, l};
        for (Speakable s : array) {
            if (s instanceof Penguin) {
                System.out.println(((Penguin) s).name);
                ((Penguin) s).sleep();
                ((Penguin) s).eat();
                ((Penguin) s).fly();
                ((Penguin) s).speak();
            } else if (s instanceof Lion) {
                System.out.println(((Lion) s).name);
                ((Lion) s).eat();
                ((Lion) s).sleep();
                ((Lion) s).run();
                ((Lion) s).speak();
            }
        }


        for (Animal a : array2) {
            if (a instanceof Mechenosec) {
                System.out.println(((Mechenosec) a).name);
                ((Mechenosec) a).swim();
                ((Mechenosec) a).eat();
                ((Mechenosec) a).sleep();
            } else if (a instanceof Penguin) {
                System.out.println(((Penguin) a).name);
                ((Penguin) a).fly();
                ((Penguin) a).eat();
                ((Penguin) a).sleep();
                ((Penguin) a).speak();
            } else if (a instanceof Lion) {
                System.out.println(((Lion) a).name);
                ((Lion) a).eat();
                ((Lion) a).sleep();
                ((Lion) a).run();
                ((Lion) a).speak();
            }
        }
    }
}
