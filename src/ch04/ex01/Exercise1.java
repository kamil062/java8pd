package ch04.ex01;

/*
Zdefiniuj klasę Point z konstruktorem public Point(double x, double y) i metodami
dostępowymi getX, getY. Zdefiniuj klasę podrzędną LabeledPoint z konstruktorem
public LabeledPoint(String label, double x, double y) oraz metodę dostępową
getLabel.
*/

public class Exercise1 {
    public static void main(String[] args){
        Point p = new Point(10, 10);
        LabeledPoint lp = new LabeledPoint("lp", 5, 5);

        System.out.printf("[Point][x=%f, y=%f]\n", p.getX(), p.getY());
        System.out.printf("[LabeledPoint][label=%s, x=%f, y=%f]\n", lp.getLabel(), lp.getX(), lp.getY());
    }
}
