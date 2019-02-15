package ch04.ex05;

/*
Zdefiniuj metody clone dla klas z poprzedniego ćwiczenia.
*/

public class Exercise5 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);

        Line line = new Line(p1, p2);
        Rectangle rectangle = new Rectangle(p1, 100, 100);
        Circle circle = new Circle(p1, 100);

        Line lineCopy = line.clone();
        Rectangle rectangleCopy = rectangle.clone();
        Circle circleCopy = circle.clone();

        lineCopy.point.setX(10);
        rectangleCopy.point.setX(10);
        circleCopy.point.setX(10);

        System.out.println(line.getCenter());
        System.out.println(rectangle.getCenter());
        System.out.println(circle.getCenter());
        System.out.println();
        System.out.println(lineCopy.getCenter());
        System.out.println(rectangleCopy.getCenter());
        System.out.println(circleCopy.getCenter());
    }
}
