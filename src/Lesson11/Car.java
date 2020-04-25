package Lesson11;

public class Car {
    String color;
    String engine;
    int numberOfDoors;

    public Car(String color, String engine,int numberOfDoors){
        this.color = color;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }
}

class CarTest {
    public static void changeNumberOfDoors (Car c, int a){
      c.numberOfDoors = a;
    }

    public static void changeColor (Car car1, Car car2){
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;
    }

    public static void main(String[] args) {
        Car c1 = new Car("blue", "V4", 4);
        Car c2 = new Car("yellow", "V6", 6);
        changeColor(c1, c2);

        System.out.println(c1.color);
        System.out.println(c2.color);

        changeNumberOfDoors(c1, 8);
        System.out.println(c1.numberOfDoors);

    }
}
