package ch04.ex04;

public class Circle extends Shape {
    private double radius;

    public Circle(Point center, double radius){
        super(center);
        this.radius = radius;
    }

    @Override
    Point getCenter() {
        return this.point;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
