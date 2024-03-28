package Session2.poo.polymorphism.dynamic;


public class MethodOverridingDemo {
    public static void main(String[] args) {
        //creating object of Base class Shape
        Shape obj;
        obj = new Shape();
        obj.draw();

        //initiating object with subclasses
        obj = new Square();
        obj.draw();

        obj = new Circle();
        obj.draw();

        obj = new Triangle();
        obj.draw();
    }
}
