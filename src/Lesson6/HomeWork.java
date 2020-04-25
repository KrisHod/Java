package Lesson6;

public class HomeWork {
    int sum () {
        int summa = 0 + 0;
        System.out.println(summa);
        return summa;

    }

    int sum (int a) {
        int summa = a + 0;
        System.out.println(summa);
        return summa;

    }

    int sum (int a, int b) {
        int summa = a + b;
        System.out.println(summa);
        return summa;

    }

    int sum (int a, int b, int c) {
        int summa = a + b + c;
        System.out.println(summa);
        return summa;

    }

    int sum (int a, int b, int c, int d) {
        int summa = a + b + c + d;
        System.out.println(summa);
        return summa;

    }
}

class HomeWorkTest {
    public static void main(String[] args) {
        HomeWork hm = new HomeWork();
        hm.sum();
        hm.sum(1);
        hm.sum(1, 2);
        hm.sum(1, 2, 3);
        hm.sum(1, 2, 3, 4);
    }
}
