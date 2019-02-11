# **Java 8 Podręcznik doświadczonego programisty**

## **Rozdział 3** - Interfejsy i wyrażenia lambda

- [Zadanie 1] - Utwórz interfejs `Measurable` z metodą double `getMeasure()`, która dostarcza jakąś metrykę obiektu. Zaimplementuj interfejs `Measurable` w klasie `Employee`. Utwórz metodę `double average(Measurable[] objects)`, która oblicza średnią metryk. Wykorzystaj ją do obliczenia średniego wynagrodzenia pracowników, których dane są zapisane w tablicy.
- [Zadanie 2] - Kontynuując poprzednie ćwiczenie, utwórz metodę `Measurable largest(Measurable[] objects)`. Wykorzystaj ją do ustalenia nazwiska pracownika z najwyższym wynagrodzeniem. Do czego użyjesz rzutowania?
- [Zadanie 3] - Jaki jest typ nadrzędny dla typu `String`? Dla typu `Scanner`? Typu `ImageOutputStream`? Zauważ, że każdy typ ma typ nadrzędny. Klasa lub interfejs bez zadeklarowanego typu nadrzędnego otrzymuje jako typ nadrzędny `Object`.
- [Zadanie 4] - Zaimplementuj statyczną metodę `of` w klasie `IntSequence`, która zwraca ciąg parametrów. Na przykład `IntSequence.of(3. l, 4, l, 5. 9)` zwraca ciąg sześciu wartości. Dodatkowe punkty możesz dostać za zwrócenie instancji wewnętrznej klasy anonimowej.
- [Zadanie 5] - Zaimplementuj metodę statyczną `constant` w klasie `IntSequence`, która zwraca nieskończony ciąg stałych. Na przykład `IntSequence.constant(l)` zwraca wartości l l l ... , w nieskończoność. Dodatkowe punkty za wykonanie tego za pomocą wyrażenia lambda.
- [Zadanie 7] - Zaimplementuj metodę `void luckySort (ArrayList<String> strings, Comparator<String> comp)`, która wywołuje `Collections.shuffle` na tablicy typu `ArrayList` do chwili, gdy elementy będą uporządkowane rosnąco w sposób określony przez komparator.
- [Zadanie 8] - Zaimplementuj klasę `Greeter`, która implementuje interfejs `Runnable` i w której metoda `run` wyświetla n kopii tekstu `"Witaj, " + target`, gdzie n i target są ustawiane w konstruktorze. Stwórz dwie instancje z różnymi komunikatami i wykonaj je równolegle w dwóch wątkach.
- [Zadanie 9] - Zaimplementuj metody:
                `public static void runTogether(Runnable... tasks)`
                `public static void runlnOrder(Runnable... tasks)`
                Pierwsza metoda powinna uruchomić każde zadanie w oddzielnym wątku i zakończyć działanie. Druga metoda powinna uruchomić wszystkie zadania w bieżącym wątku i zakończyć działanie po zakończeniu ostatniego z nich.
- [Zadanie 10] - Korzystając z metod `listFiles(FileFilter)` i `isDirectory` z klasy `java.io.File`, napisz metodę zwracającą wszystkie podkatalogi wskazanego katalogu. Wykorzystaj wyrażenie lambda zamiast obiektu `FileFilter`. Wykonaj to samo za pomocą wyrażenia z metodą i anonimowej klasy wewnętrznej.
- [Zadanie 11] - Korzystając z metody `list(FilenameFilter)` klasy `java.io.File`, napisz metodę zwracającą wszystkie pliki ze wskazanego katalogu ze wskazanym rozszerzeniem. Użyj wyrażenia lambda, a nie `FilenameFilter`. Jakie zmienne zewnętrzne wykorzystasz?
- [Zadanie 12] - Mając tablicę obiektów `File`, posortuj je w taki sposób, by katalogi znalazły się przed plikami, a w każdej grupie elementy zostały posortowane według nazwy. Użyj wyrażenia lambda przy implementowaniu interfejsu `Comparator`.
- [Zadanie 13] - Napisz metodę, która pobiera tablicę instancji klas implementujących interfejs `Runnable` i zwraca instancję `Runnable`, której metoda `run` wykonuje kolejno kod instancji obiektów zapisanych w tablicy. Zwróć wyrażenie lambda.
- [Zadanie 14] - Napisz wywołanie `Arrays.sort`, które sortuje pracowników według wynagrodzenia, a w przypadku takich samych wynagrodzeń według nazwiska. Użyj `Comparator.thenComparing`. Następnie wykonaj to samo w odwrotnej kolejności.


[Zadanie 1]: <ex01/Exercise1.java>
[Zadanie 2]: <ex02/Exercise2.java>
[Zadanie 3]: <ex03/README.MD>
[Zadanie 4]: <ex04/Exercise4.java>
[Zadanie 5]: <ex05/Exercise5.java>
[Zadanie 7]: <ex07/Exercise7.java>
[Zadanie 8]: <ex08/Exercise8.java>
[Zadanie 9]: <ex09/Exercise9.java>
[Zadanie 10]: <ex10/Exercise10.java>
[Zadanie 11]: <ex11/Exercise11.java>
[Zadanie 12]: <ex12/Exercise12.java>
[Zadanie 13]: <ex13/Exercise13.java>
[Zadanie 14]: <ex14/Exercise14.java>
