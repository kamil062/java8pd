package ch02.ex08;

/*
W poprzednich ćwiczeniach tworzenie konstruktorów i metod pobierających dane
klasy Point było dość powtarzatlnym zadaniem. Większość IDE ofenue mechanizmy
ułatwiające pisanie takiego kodu. Co jest dostępne w IDE, którego używasz?
*/

/**
 * Klasa z metodami wygenerowanymi automatycznie przez IDE IntelliJ IDEA.
 */
public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
