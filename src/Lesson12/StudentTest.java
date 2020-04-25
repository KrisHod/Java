package Lesson12;

import Lesson11.Student;

public class StudentTest {

    void sravnenie1 (Student s1, Student s2){
       if (s1.equals(s2) && s1.course==s2.course && s1.grade == s2.grade) {
           System.out.println("Студенты одинаковые");
       }
       else {
           System.out.println("Студенты не одинаковые");
       }
    }

    void sravnenie2 (Student s1, Student s2){
        if (s1.course > s2.course){
            if (s1.grade > s2.grade) {
                System.out.println("Первый студент старше и учится лучше");
            }
            else {
                System.out.println("Первый студент старше, но учится хуже");
            }
            }
        else if (s1.course < s2.course ) {
            if (s1.grade > s2.grade) {
                System.out.println("Второй студент старше и учится хуже");
            }
            else {
                System.out.println("Второй студент старше и учится лучше");
            }
            }
        else {
            System.out.println("Они на одинаковом курсе");
        }
    }


    public static void main(String[] args) {
        Student st1 = new Student ("Petr", 3, 4.6);
        Student st2 = new Student("Vasiliy", 5, 5.6);
        StudentTest st = new StudentTest();
        st.sravnenie1(st1,st2);
        st.sravnenie2(st1,st2);
    }



}
