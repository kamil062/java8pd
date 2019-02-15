package ch04.ex05;

public class Circle extends Shape implements Cloneable {
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
    public Circle clone() throws CloneNotSupportedException {
        Circle cloned = (Circle) super.clone();
        cloned.point = new Point(cloned.point.getX(), cloned.point.getY());

        return cloned;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
