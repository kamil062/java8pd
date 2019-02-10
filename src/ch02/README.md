# **Java 8 Podręcznik doświadczonego programisty**

## **Rozdział 2** - Programowanie obiektowe

- [Zadanie 1] - Zmień program wyświetlający kalendarz w taki sposób, by zaczynał tydzień od niedzieli. Niech dodaje też pusty wiersz na końcu (ale tylko jeden).
- [Zadanie 2] - Przyjrzyj się metodzie `nextInt` z klasy `Scanner` . Czy jest to metoda dostępowa, czy modyfikująca? Dlaczego? A jak jest z metodą `nextInt` z klasy `Random`?
- [Zadanie 3] - Czy może istnieć metoda modyfikująca zwracająca coś innego niż `void`? Czy może istnieć metoda dostępowa zwracająca `void`? Jeśli tak, podaj przykłady.
- [Zadanie 4] - Dlaczego nie można zaimplementować w Javie metody zamieniającej zawartość dwóch zmiennych typu `int`? Zamiast tego napisz metodę zamieniającą zawartość dwóch obiektów `IntHolder`. (Dokumentację tej dość prostej klasy znajdziesz w dokumentacji API). Czy możesz zamienić zawartość dwóch obiektów typu `Integer`?
- [Zadanie 5] - Zaimplementuj niemodyfikowalną klasę `Point` opisującą punkt na płaszczyźnie. Dołącz konstruktor ustawiający ją na konkretny punkt, konstruktor bez argumentów ustawiający ją na punkt odniesienia oraz metody: `getX`, `getY`, `translate` i `scale`. Metoda `translate` przesuwa punkt o podaną w zmiennych odległość w kierunku x i y. Metoda `scale` skaluje obie współrzędne o podany współczynnik.
Zaimplementuj te metody w taki sposób, by w wyniku działania zwracały nowe punkty. Na przykład wyrażenie
`Point p = new Point(3, 4).translate(l, 3).scale(0.5);`
powinno ustawić p na punkt o współrzędnych (2.3, 5).
- [Zadanie 6] - Powtórz poprzednie ćwiczenie, ale translate i scale zaimplementuj jako metody modyfikujące.
- [Zadanie 7] - Dodaj komentarze javadoc do obu wersji klasy `Point` z poprzednich ćwiczeń.
- [Zadanie 8] - W poprzednich ćwiczeniach tworzenie konstruktorów i metod pobierających dane klasy `Point` było dość powtarzatlnym zadaniem. Większość IDE ofenue mechanizmy ułatwiające pisanie takiego kodu. Co jest dostępne w IDE, którego używasz?
- [Zadanie 9] - Zaimplementuj klasę `Car`, która modeluje samochód poruszający się wzdłuż osi x i zużywający w czasie jazdy benzynę. Dołącz metody pozwalające na przejechanie podanej odległości w kilometrach, zatankowanie określonej ilości benzyny w litrach oraz pobranie przejechanej odległości od początku podróży i poziomu benzyny. Określ spalanie (w litrach na l00 km) w konstruktorze. Czy ta klasa powinna być niemodyfikowalna? Dlaczego?
- [Zadanie 10] - W klasie `RandomNumbers` dostarcz dwie metody statyczne randomElement, które pobierają losowy element z tablicy zawierającej liczby całkowite lub obiektu `ArrayList`. (Zwracaj zero, jeśli tablica jest pusta). Dlaczego nie możesz zaimplementować tych metod jako metod instancji `int[]` lub `ArrayList<Integer>`?
- [Zadanie 11] - Przepisz klasę `Cal` w taki sposób, by używać statycznego importowania dla klas `System` i `LocalDate`.
- [Zadanie 15] - Zaimplementuj całą klasę `Invoice` z podrozdziału 2.6.1 , "Zagnieżdżone klasy statyczne". Dodaj metodę wyświetlającą fakturę, oraz program demonstracyjny, który tworzy i wyświetla przykładową fakturę.
- [Zadanie 16] - Zaimplementuj klasę `Queue`, nieograniczoną kolejkę ciągów znaków. Dodaj metodę `add`, która dodaje element na końcu, oraz metodę `remove` usuwającą element z początku kolejki. Zaimplementuj elementy w postaci połączonej listy węzłów. Zaimplementuj `Node` jako klasę zagnieżdżoną. Czy powinna ona być klasą statyczną?
- [Zadanie 17] - Dla kolejki z poprzedniego ćwiczenia utwórz iterator - obiekt, który zwraca po kolei elementy z kolejki. Zaimplementuj `Iterator` jako klasę zagnieżdżoną z metodarni `next` i `hasNext`. Dodaj metodę `iterator()` w klasie `Queue`, która zwróci obiekt `Queue.Iterator`. Czy iterator powinien być statyczny?

[Zadanie 1]: <ex01/Calendar.java>
[Zadanie 2]: <ex02/README.MD>
[Zadanie 3]: <ex03/Exercise3.java>
[Zadanie 4]: <ex04/Exercise4.java>
[Zadanie 5]: <ex05/Exercise5.java>
[Zadanie 6]: <ex06/Exercise6.java>
[Zadanie 7]: <ex07/README.MD>
[Zadanie 8]: <ex08/Point.java>
[Zadanie 9]: <ex09/Exercise9.java>
[Zadanie 10]: <ex10/Exercise10.java>
[Zadanie 11]: <ex11/Calendar.java>
[Zadanie 15]: <ex15/Exercise15.java>
[Zadanie 16]: <ex16/Exercise16.java>
[Zadanie 17]: <ex16/Exercise17.java>
