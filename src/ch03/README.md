# **Java 8 Podręcznik doświadczonego programisty**

## **Rozdział 3** - Interfejsy i wyrażenia lambda

- [Zadanie 1] - Utwórz interfejs `Measurable` z metodą double `getMeasure()`, która dostarcza jakąś metrykę obiektu. Zaimplementuj interfejs `Measurable` w klasie `Employee`. Utwórz metodę `double average(Measurable[] objects)`, która oblicza średnią metryk. Wykorzystaj ją do obliczenia średniego wynagrodzenia pracowników, których dane są zapisane w tablicy.
- [Zadanie 2] - Kontynuując poprzednie ćwiczenie, utwórz metodę `Measurable largest(Measurable[] objects)`. Wykorzystaj ją do ustalenia nazwiska pracownika z najwyższym wynagrodzeniem. Do czego użyjesz rzutowania?
- [Zadanie 3] - Jaki jest typ nadrzędny dla typu `String`? Dla typu `Scanner`? Typu `ImageOutputStream`? Zauważ, że każdy typ ma typ nadrzędny. Klasa lub interfejs bez zadeklarowanego typu nadrzędnego otrzymuje jako typ nadrzędny `Object`.
- [Zadanie 4] - Zaimplementuj statyczną metodę `of` w klasie `IntSequence`, która zwraca ciąg parametrów. Na przykład `IntSequence.of(3. l, 4, l, 5. 9)` zwraca ciąg sześciu wartości. Dodatkowe punkty możesz dostać za zwrócenie instancji wewnętrznej klasy anonimowej.
- [Zadanie 5] - Zaimplementuj metodę statyczną `constant` w klasie `IntSequence`, która zwraca nieskończony ciąg stałych. Na przykład `IntSequence.constant(l)` zwraca wartości l l l ... , w nieskończoność. Dodatkowe punkty za wykonanie tego za pomocą wyrażenia lambda.

[Zadanie 1]: <ex01/Exercise1.java>
[Zadanie 2]: <ex02/Exercise2.java>
[Zadanie 3]: <ex03/README.MD>
[Zadanie 4]: <ex04/Exercise4.java>
[Zadanie 5]: <ex05/Exercise5.java>
