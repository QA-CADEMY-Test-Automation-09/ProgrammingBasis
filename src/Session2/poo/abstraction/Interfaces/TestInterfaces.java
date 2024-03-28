package Session2.poo.abstraction.Interfaces;

public class TestInterfaces {

    public static void main(String[] args){
        Shape circle = new Circle("Red", 5.0);
        System.out.println(circle.info());

        Shape square = new Square("Blue", 10.0);
        System.out.println(square.info());

    }
}
