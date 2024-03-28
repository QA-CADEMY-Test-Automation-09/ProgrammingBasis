package Session2.poo.inheritance.Hierarchical;

public class TestHierarchical
{
    public static void main(String[] args)
    {
        Teacher teacher = new Teacher();
        Student student = new Student();
        Doctor doctor = new Doctor();
        student.show();
        student.show1();
        teacher.show2();
        doctor.show3();
    }
}