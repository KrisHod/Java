package Lesson22;

public class Animal {
    public Animal(){
        System.out.println("I am animal");
    }
    int eyes;
    public void eat (){
        System.out.println("Animal eats");
    }
    public void drink (){
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal{
    Pet (){
        eyes = 2;
        System.out.println("I am pet");
    }
    String name;
    int tail = 1;
    int paw = 4;
    public void run (){
        System.out.println("Pet runs");
    }
    public void jump (){
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet{
    Dog (String name){
        this.name = name;
        System.out.println("I am dog and my name is " + name);
    }
    public void play (){
        System.out.println("Dog plays");
    }
}
 class Cat extends Pet{
    Cat (String name){
        this.name = name;
        System.out.println("I am cat and my name is " + name);
    }
     public void sleep (){
         System.out.println("Cat is sleeping");
     }
 }

 class  Test {
     public static void main(String[] args) {
         Dog d = new Dog("Jack");
         System.out.println("У собаки " + d.paw + " лапы.");
         System.out.println();
         Cat c = new Cat("Monika");
         c.sleep();
     }
 }
