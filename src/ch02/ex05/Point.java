package ch02.ex05;

/**
 * Klasa opisuje punkt na płaszczyźnie
 */
public class Point {
    private double x;
    private double y;

    public Point() {
        this(0.0, 0.0);
    }

    /**
     * Inicjalizuje współrzędne pubktu
     * @param x Współrzędna x
     * @param y Współrzędna y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Wykonuje translację punktu o zadany wektor
     * @param x Translacja pozioma
     * @param y Translacja pionowa
     * @return Punkt po translacji
     */
    public Point translate(double x, double y) {
        return new Point(this.x + x, this.y + y);
    }

    /**
     * Skaluje punkt o zadany współczynnik
     * @param factor Współczynnik skalowania
     * @return Przeskalowany punkt
     */
    public Point scale(double factor) {
        return new Point(this.x * factor, this.y * factor);
    }

    /**
     * Zwraca współrzędną X
     * @return Pozycja X punktu
     */
    public double getX() {
        return this.x;
    }

    /**
     * Zwraca współrzędną Y
     * @return Pozycja Y punktu
     */
    public double getY() {
        return this.y;
    }
}
