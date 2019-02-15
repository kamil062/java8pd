package ch04.ex04;

public class Line extends Shape {
    private Point point2;

    public Line(Point from, Point to){
        super(from);
        this.point2 = to;
    }

    @Override
    Point getCenter() {
        return new Point((this.point2.getX() - this.point.getX()) / 2, (this.point2.getY() - this.point.getY()) / 2);
    }

    @Override
    public String toString() {
        return "Line{" +
                "point2=" + point2 +
                "} " + super.toString();
    }
}
