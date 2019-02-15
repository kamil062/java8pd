package ch04.ex05;

public class Rectangle extends Shape implements Cloneable {
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height){
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    Point getCenter() {
        return new Point(this.point.getX() + this.width / 2, this.point.getY() + this.height / 2);
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        Rectangle cloned = (Rectangle) super.clone();
        cloned.point = new Point(cloned.point.getX(), cloned.point.getY());

        return cloned;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "} " + super.toString();
    }
}
