package ch04.ex04;

/*
Zdefiniuj klasę abstrakcyjną Shape ze zmiennymi instancji klasy Point, konstruktorem,
zdefiniowaną metodą public void moveBy(double dx, doubledy), która przesuwa
punkt o zadaną wielkość, oraz abstrakcyjną metodą public Point getCenter().
Utwórz zdefiniowane klasy podrzędne: Circle, Rectangle, Line z konstnruktorami:
public Circle(Point center, double radius), public Rectangle(Point topLeft,
double width, double height) oraz public Line(Point from, Point to).
*/

public class Exercise4 {
    public static void main(String[] args){
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);

        Line line = new Line(p1, p2);
        Rectangle rectangle = new Rectangle(p1, 100, 100);
        Circle circle = new Circle(p1, 100);

        System.out.println(line.getCenter());
        System.out.println(rectangle.getCenter());
        System.out.println(circle.getCenter());
    }
}
