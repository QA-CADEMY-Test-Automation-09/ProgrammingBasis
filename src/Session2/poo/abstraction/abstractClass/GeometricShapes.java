package Session2.poo.abstraction.abstractClass;

abstract class GeometricShapes {

    String nameOfShape;

    public GeometricShapes(String nameOfShape) {
        System.out.println("Inside the Constructor of GeometricShapes class ");
        this.nameOfShape = nameOfShape;
    }
    //abstract methods

    abstract double calculateArea();

    public abstract String toString();
    //constructor

    //non-abstract method
    public String getNameOfShape() {
        return nameOfShape;
    }
}
