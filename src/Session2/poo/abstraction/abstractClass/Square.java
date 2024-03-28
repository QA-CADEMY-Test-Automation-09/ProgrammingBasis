package Session2.poo.abstraction.abstractClass;


class Square extends GeometricShapes
{
    double length;
    public Square(String nameOfShape,double length)
    {
        //calling Shape constructor
        super(nameOfShape);
        System.out.println("Inside the Constructor of Square class ");
        this.length = length;
    }
    //implementing the methods
    @Override
    double calculateArea()
    {
        return length * length;
    }
    @Override
    public String toString()
    {
        return "Name of the Shape is " + super.nameOfShape +
                " and its area is: " + calculateArea();
    }
}