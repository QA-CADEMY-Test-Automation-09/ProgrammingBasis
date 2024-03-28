package Session2.poo.inheritance.Single;

public class TestSingle {
    public static void main(String args[]) {
        Student obj = new Student();
        obj.show();
        obj.show1();
        System.out.println("Name of student: " + obj.name);
        System.out.println("Course opted by the student: " + obj.course);
    }
}
