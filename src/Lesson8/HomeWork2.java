package Lesson8;

public class HomeWork2 {
    static final double Pi = 3.14;

    double square (double r){
       double squareCircle = Pi * r * r;
       return squareCircle;
    }

    static double circle (double r2){
        double lenght = 2 * Pi * r2;
        return lenght;
    }

    void info ( double r3){
        System.out.println(r3);
        System.out.println("Area of a circle is " + square(r3));
        System.out.println("circle is " + circle(r3));
    }
}

class HomeWork2Test {
    public static void main(String[] args) {
        HomeWork2 h = new HomeWork2();
        h.square(5.5);
        HomeWork2.circle(7);
        h.info(8);


    }
}
