package Lesson8;

public class HomeWork {
    static int multiply (int a,int b, int c){
      return a*b*c;
    }

    static void divide (int a, int b){
        System.out.println("Celoe chislo: " + a/b + " , ostatok: " + a%b);
    }

}

 class HomeWorkTest {
    public static void main(String[] args) {
        System.out.println(HomeWork.multiply(2,3,4) );

        HomeWork.divide(5,2);
    }
}

