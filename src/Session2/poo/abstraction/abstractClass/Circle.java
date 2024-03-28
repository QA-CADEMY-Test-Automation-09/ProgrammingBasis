package Session2.poo.abstraction.abstractClass;

class Circle extends GeometricShapes {
    double radius;

    public Circle(String nameOfShape, double radius) {
        super(nameOfShape);
        System.out.println("Inside the Constructor of Circle class ");
        this.radius = radius;
    }

    //implementing the methods
    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Name of the shape is " + super.nameOfShape +
                " and its area is: " + calculateArea();
    }
}