package ch02.ex06;

/*
Powtórz poprzednie ćwiczenie, ale translate i scale zaimplementuj jako metody
modyfikujące.
*/

public class Exercise6 {
    public static void main(String[] args){
        Point p = new Point(3, 4);
        p.translate(1, 3);
        p.scale(0.5);

        System.out.printf("P(%.2f; %.2f)\n", p.getX(), p.getY());
    }
}
