package Lesson14;

public class Time {
    static void time (){
        int chas = 0;
        OUTER: while (chas<6) {
            int min = -1;
            MIDDLE: do {
                min ++;
                if (chas>1 && min%10==0){
                    break OUTER;
                }
                int sec = 0;
                INNER: while (sec<=59){
                    if (sec * chas > min) {
                        continue MIDDLE;
                    }
                    System.out.println(chas + ":" + min + ":" + sec);
                    sec ++;
                }

            }
            while (min<59);

            chas++;
        }
    }

    public static void main(String[] args) {
        time();
        int age =23;
        System.out.println( "Jack is" + age +" years old.");
    }
}
