package Lesson4;

public class Student {
    Student (int id1, String name1, String surname1, int year1, double averageMath1, double averageEcon1, double averageLang1 ) {
        id= id1;
        name=name1;
        surname=surname1;
        year=year1;
        averageMath=averageMath1;
        averageEcon=averageEcon1;
        averageLang=averageLang1;
    }

    Student (int id2, String name2, String surname2, int year2) {
        this (id2,name2,surname2, year2, 0.0, 0.0, 0.0);

    }

    Student () {
    }

    int id;
    String name;
    String surname;
    int year;
    double averageMath;
    double averageEcon;
    double averageLang;

}

class StudentTest {
    double averageNote (Student st) {
        double averageNote2 = (st.averageEcon + st.averageLang + st.averageMath)/3;
        System.out.println(averageNote2);
        return averageNote2;
    }

    public static void main (String[] args) {
        Student Student1 = new Student();
        Student1.id = 1;
        Student1.name = "Gad";
        Student1.surname = "Byskin";
        Student1.year = 2;
        Student1.averageMath = 6;
        Student1.averageEcon = 5.5;
        Student1.averageLang = 4.5;

        Student Student2 = new Student(1, "Vasya", "Petrov", 3, 4.5, 5.5, 4.3);

        Student Student3 = new Student(2, "Petya", "Sidirov", 4);
        Student3.averageMath = 8;
        Student3.averageEcon = 6.5;
        Student3.averageLang = 3.5;

        StudentTest sTest = new StudentTest();
        sTest.averageNote(Student1);
        sTest.averageNote(Student2);
        sTest.averageNote(Student3);

    }
}