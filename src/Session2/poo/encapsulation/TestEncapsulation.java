package Session2.poo.encapsulation;

public class TestEncapsulation {
    public static void main (String[] args)
    {
        Encapsulation obj = new Encapsulation();

        // setting values of the variables through setter methods
        obj.setName("Bruno Vasquez");
        obj.setAge(22);
        obj.setProfile("Quality Control");

        // Displaying values of the variables through Getter methods
        System.out.println("Name of the employee: " + obj.getName());
        System.out.println("Age of the employee: " + obj.getAge());
        System.out.println("Profile of the employee: " + obj.getProfile());
    }
}
