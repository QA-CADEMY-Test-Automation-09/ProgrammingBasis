package Session2.poo.abstraction.abstractClass;


public class TestAbstraction
{
    public static void main(String[] args)
    {
        GeometricShapes shapeObject1 = new Circle("Circle", 6.5);
        System.out.println(shapeObject1.toString());

        GeometricShapes shapeObject2 = new Square("Rectangle",8);
        System.out.println(shapeObject2.toString());
    }
}
