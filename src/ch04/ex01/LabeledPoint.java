package ch04.ex01;

/*
Zdefiniuj klasę Point z konstruktorem public Point(double x, double y) i metodami
dostępowymi getX, getY. Zdefiniuj klasę podrzędną LabeledPoint z konstruktorem
public LabeledPoint(String label, double x, double y) oraz metodę dostępową
getLabel.
*/

public class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(String label, double x, double y){
        super(x, y);
        this.label = label;
    }

    public String getLabel(){
        return this.label;
    }
}
