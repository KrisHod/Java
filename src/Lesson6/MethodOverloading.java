package Lesson6;

public class MethodOverloading {
    void show (int i1) {
        System.out.println(i1);
    }

    void show (boolean b1){
        System.out.println(b1);
    }

    void show (String s1){
        System.out.println(s1);
    }

    void show (String s, int a){
        System.out.println("String: " + s + ", Int: " + a);
    }

    void show (int a, String s){
        System.out.println("Bla-bla");
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.show (a);
        boolean b = true;
        mO.show (b);
        String s = "Hello!";
        mO.show (s);
        mO.show("Privetiki", 6);
    }
}
