package Lesson7;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public void znId () {
        System.out.println(id);
    }

    public void znSurname () {
        System.out.println(surname);
    }

    public void znSalary () {
        System.out.println(salary);
    }

    public Employee (int id1, String surname1) {
        id = id1;
        surname = surname1;
    }

    private Employee (int id2, String surname2, int age2) {
        id = id2;
        surname = surname2;
        age = age2;
    }

     Employee () {
    }

    static class EmployeeTest {
        public static void main(String[] args) {
            Employee em1 = new Employee();
            em1.id = 2;
            em1.znId();

            Employee em2 = new Employee(3,"Petrov", 45);
            System.out.println(em2.surname);;

            


        }
    }


}
