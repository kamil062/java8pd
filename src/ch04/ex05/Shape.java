package ch04.ex05;

public abstract class Shape {
    Point point;

    Shape(Point point){
        this.point = point;
    }

    void moveBy(double dx, double dy) {
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
    }

    abstract Point getCenter();

    @Override
    public String toString() {
        return "Shape{" +
                "point=" + point +
                '}';
    }
}
