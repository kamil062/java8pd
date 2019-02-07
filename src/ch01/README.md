# **Java 8 Podręcznik doświadczonego programisty**

## **Rozdział 1** - Podstawowe struktury programistyczne

- [Zadanie 1] - Napisz program, który wczytuje zmienną całkowitą i wyświetla ją w postaci liczby binarnej, ósemkowej i szesnastkowej. Wyświetl jej odwrotność w postaci szesnastkowej liczby zmiennoprzecinkowej.
- Zadanie 2 - Napisz program, który wczytuje l iczbę całkowitą opisującą kąt (która może mieć wartość dodatnią lub ujemną) i normalizuje ją do wartości od O do 359 stopni. Najpierw spróbuj zrobić to za pomocą operatora %, a następnie za pomocą metody floorMod.
- Zadanie 3 - Korzystając z operatora warunkowego, napisz program, który wczytuje trzy liczby całkowite i wyświetla największą z nich. Powtórz to samo z użyciem Math.max.
- Zadanie 4 - Napisz program wyświetlający najmniejszą i największą liczbę dodatnią typu double. Podpowiedź: poszukaj Math.nextUp w Java API.
- Zadanie 5 - Co się stanie, jeśli wykonasz rzutowanie zmiennej typu double do typu int w sytuacji, gdy ma ona większą wartość niż największa możliwa do zapisania w typie int? Spróbuj
- Zadanie 6 - Napisz program, który oblicza silnię n!= 1, 2 ... n, wykorzystując Biginteger . Oblicz silnię 1000.
- Zadanie 7 - Napisz program, który wczytuje dwie liczby z zakresu od O do 65 535, zapisuje je w zmiennych typu short, a następnie oblicza bez znaku ich sumę, różnicę, iloczyn, iloraz i resztę z dzielenia bez konwertowania ich do typu int.
- Zadanie 8 - Napisz program, który wczytuje ciąg znaków i wyświetla wszystkie zawarte w nim niepuste ciągi znaków.
- Zadanie 9 - Podrozdział 1.5.3, "Porównywanie ciągów znaków", zawiera przykład dwóch ciągów znaków s i t takich, że s.equals(t), ale s != t . Podaj inny przykład bez korzystania z metody substring.
- Zadanie 10 - Napisz program, który tworzy losowy ciąg liter i cyfr, generując losową wartość typu long i wyświetlając ją w systemie o podstawie 36.
- Zadanie 11 - Napisz program, który wczytuje wiersz tekstu i wyświetla wszystkie litery, które nie należą do zbioru ASCII wraz z ich wartościami Unicode.
- Zadanie 12 - W Java Development Kit jest plik src.zip zawierający kod źródłowy biblioteki Java. Rozpakuj go i za pomocą swojego ulubionego narzędzia do przeszukiwania tekstu odszukaj przykłady zastosowania nazwanych instrukcji break i continue. Wybierz jeden fragment z takim kodem i przepisz go bez wykorzystania takiej instrukcji.
- Zadanie 13 - Napisz program, który wyświetla zestawy liczb do Lotto, wybierając sześć różnych liczb z zakresu od l do 49. Aby uzyskać sześć różnych liczb, zacznij od stworzenia tablicy typu ArrayList, wypełnionej wartościami od l do 49. Losowo wybierz jedną z liczb i usuń reprezentujący ją element z tablicy. Powtórz to sześć razy. Wyświetl wylosowane liczby uporządkowane rosnąco.
- Zadanie 14 - Napisz program, który wczytuje dwuwymiarową tablicę liczb całkowitych i ustala, czy jest ona kwadratem magicznym (takim, w którym sumy wartości we wszystkich wierszach, wszystkich kolumnach i na przekątnych są równe). Wczytuj wiersze zawierające liczby, które można odczytać jako liczby całkowite, i przerwij wczytywanie po napotkaniu pustego wiersza. Na przykład dla danych
16 3 2 13
5 lO ll 8
9 6 7 12
4 15 14 l
(Pusty wiersz)
Twój program powinien rozpoznać kwadrat magiczny.
- Zadanie 15 - Napisz program, który zapisuje trójkąt Pascala do stopnia n w ArrayList<ArrayList<Integer>>.
- Zadanie 16 - Popraw metodę average w taki sposób, by przy jej wywoływaniu konieczne było podanie przynajmniej jednego parametru.

[Zadanie 1]: </ex01/Exercise1.java>
