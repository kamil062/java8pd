# **Java 8 Podręcznik doświadczonego programisty**

## **Rozdział 4** - Dziedziczenie i mechanizm refleksji

- [Zadanie 1] - Zdefiniuj klasę `Point` z konstruktorem public `Point(double x, double y)` i metodami dostępowymi `getX`, `getY`. Zdefiniuj klasę podrzędną `LabeledPoint` z konstruktorem public `LabeledPoint(String label, double x, double y)` oraz metodę dostępową `getLabel`.
- [Zadanie 2] - Zdefiniuj metody `toString`, `equals` i `hashCode` dla klasy z poprzedniego ćwiczenia.
- [Zadanie 4] - Zdefiniuj klasę abstrakcyjną `Shape` ze zmiennymi instancji klasy `Point`, konstruktorem, zdefiniowaną metodą `public void moveBy(double dx, doubledy)`, która przesuwa punkt o zadaną wielkość, oraz abstrakcyjną metodą `public Point getCenter()`. Utwórz zdefiniowane klasy podrzędne: `Circle`, `Rectangle`, `Line` z konstnruktorami: `public Circle(Point center, double radius)`, `public Rectangle(Point topLeft, double width, double height)` oraz `public Line(Point from, Point to)`.
- [Zadanie 5] - Zdefiniuj metody `clone` dla klas z poprzedniego ćwiczenia.
- [Zadanie 6] - Załóżmy, że w podrozdziale 4.2.2, "Metoda equals", metoda `Item.equals` korzysta z testu `instanceof`. Zaimplementuj `DiscountedItem.equals` w taki sposób, by porównywała tylko klasę nadrzędną, jeśli `otherObject` jest klasy `Item`, ale również brała pod uwagę zniżkę, jeśli jest ona klasy `DiscountedItem`. Pokaż, że ta metoda zachowuje symetrię, ale nie jest przechodnia - czyli znajdź takie instancje obu klas, by prawdziwe było `x.equals(y)` i `y.equals(z)`, ale nie `x.equals(z)`.
- [Zadanie 7] - Zdefiniuj typ wyliczeniowy dla ośmiu kombinacji kolorów podstawowych: `BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE` z metodami: `getRed`, `getGreen` i `getBlue`.
- [Zadanie 9] - Napisz "uniwersalną" metodę `toString` wykorzystującą refleksje do zwrócenia ciągu znaków ze wszystkimi zmiennymi instancji obiektu. Dostaniesz dodatkowe punkty, jeśli potrafisz obsłużyć odwołania cykliczne.
- [Zadanie 10] - Wykorzystaj program `MethodPrinter` z podrozdziału 4.5.1, "Wyliczanie elementów klasy", do wyliczenia wszystkich metod klasy `int[]`. Dostaniesz dodatkowe punkty, jeśli potrafisz zidentyfikować źle opisaną metodę (omówioną w tym rozdziale).
- [Zadanie 11] - Napisz program "Witaj, świecie", wykorzystując mechanizm refleksji do odnalezienia pola `out` w `java.lang.System` i korzystając z `invoke` do wywołania metody `println`.
- [Zadanie 12] - Zmierz różnicę wydajności pomiędzy zwykłym wywołaniem metody a wywołaniem metody za pomocą refleksji.

[Zadanie 1]: <ex01/Exercise1.java>
[Zadanie 2]: <ex02/Exercise2.java>
[Zadanie 4]: <ex04/Exercise4.java>
[Zadanie 5]: <ex05/Exercise5.java>
[Zadanie 6]: <ex06/Exercise6.java>
[Zadanie 7]: <ex07/Exercise7.java>
[Zadanie 9]: <ex09/Exercise9.java>
[Zadanie 10]: <ex10/Exercise10.java>
[Zadanie 11]: <ex11/Exercise11.java>
[Zadanie 12]: <ex12/Exercise12.java>
