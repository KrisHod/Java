package Lesson5;

public class Methods {
    int summa (int a, int b, int c) {
        int result = a+b+c;
        return result;
    }
}

class MethodsTest {
    public static void main (String [] args) {
     Methods t = new Methods(); 
        System.out.println(t.summa(1,2,3));
    }
}