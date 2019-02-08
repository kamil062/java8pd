package ch02.ex05;

/*
Zaimplementuj niemodyfikowalną klasę Point opisującą punkt na płaszczyźnie.
Dołącz konstruktor ustawiający ją na konkretny punkt, konstruktor bez argumentów
ustawiający ją na punkt odniesienia oraz metody: getX, getY, translate i scale.
Metoda translate przesuwa punkt o podaną w zmiennych odległość w kierunku
x i y. Metoda scale skaluje obie współrzędne o podany współczynnik.
Zaimplementuj te metody w taki sposób, by w wyniku działania zwracały nowe
punkty. Na przykład wyrażenie
Point p = new Point(3, 4).translate(l, 3).scale(0.5);
powinno ustawić p na punkt o współrzędnych (2.3, 5).
*/

public class Exercise5 {
    public static void main(String[] args){
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);

        System.out.printf("P(%.2f; %.2f)\n", p.getX(), p.getY());
    }
}
