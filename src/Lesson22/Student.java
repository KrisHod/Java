package Lesson22;

public class Student {
    private StringBuilder name;
    public StringBuilder getName (){
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public void setName (StringBuilder n){
        if (n.length()>3){
            name = n;
        }
    }

    private int course;
    public int getCourse (){
        return course;
    }
    public void setCourse (int c){
        if (c>=1 && c<=4){
          course=c;
        }
    }

    private double grade;
    public double getGrade(){
        return grade;
    }
    public void setGrade (double g){
        if (g>0 && g<11){
            grade = g;
        }
    }

    public void showInfo (){
        System.out.println("Name of student is " + getName() + ".\n" + "Course of student is " + getCourse() + ".\n" + "Grade of student is " + getGrade() + ".");
    }

}

class TestStudent {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName(new StringBuilder("Alex"));
        st.setGrade(5.5);
        st.setCourse(4);
        st.showInfo();
    }
}
