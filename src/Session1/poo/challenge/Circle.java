package Session1.poo.challenge;

public class Circle {
    private double radius;
    Circle() {
        this.radius = 1.0;
    }
    Circle(double radius) {
        this.radius = radius;
    }
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return Math.PI * (radius * radius);
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
