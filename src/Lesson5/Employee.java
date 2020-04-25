package Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee (int id2, String surname2, int age2, double salary2, String department2){
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    double increaseOfWage () {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee em1 = new Employee(1, "Petrov", 23, 300, "accounter");
        Employee em2 = new Employee(2, "Sidorov", 45, 600.5, "HR");

        System.out.println("Novaya zarplata " + em1.surname + " " + em1.increaseOfWage());
        System.out.println("Novaya zarplata " + em2.surname + " " + em2.increaseOfWage());
        }
    }
