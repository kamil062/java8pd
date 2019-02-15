package ch04.ex05;

public class Line extends Shape implements Cloneable {
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
    public Line clone() throws CloneNotSupportedException {
        Line cloned = (Line) super.clone();
        cloned.point = new Point(cloned.point.getX(), cloned.point.getY());
        cloned.point2 = new Point(cloned.point2.getX(), cloned.point2.getY());

        return cloned;
    }

    @Override
    public String toString() {
        return "Line{" +
                "point2=" + point2 +
                "} " + super.toString();
    }
}
