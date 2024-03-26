package Session1.poo.challenge;

public class TestCircle {
    public static void main(String[] args) {
        // Test Constructor
        Circle c1 = new Circle(1.1);
        System.out.println(c1);
        Circle c2 = new Circle();
        System.out.println(c2);

        // Test setter
        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("radius is: " + c1.getRadius());

        // Test getArea() and getCircumference()
        System.out.println("area is: " + c1.getArea());
        System.out.println("Circumference is: " + c1.getCircumference());
    }
}
