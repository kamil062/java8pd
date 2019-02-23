# **Java 8 Podręcznik doświadczonego programisty**

## **Rozdział 6** - Programowanie uogólnione

- [Zadanie 1] - Zaimplementuj klasę `Stack<E>`, która zarządza tablicą typu `ArrayList` zawierającą elementy typu E. Utwórz metody: `push`, `pop` i `isEmpty`.
- [Zadanie 2] - Zaimplementuj klasę `EStack<E>`, używając zwykłej tablicy do przechowywania elementów. Jeśli to konieczne, powiększaj tablicę w metodzie `push`. Utwórz dwa rozwiązania, jedno z tablicą `E[]`, drugie z tablicą `Object[]`. Oba rozwiązania powinny kompilować się bez ostrzeżeń. Które uważasz za lepsze i dlaczego?
- [Zadanie 3] - Zaimplementuj klasę `Table<K, V>`, która zarządza tablicą typu `ArrayList` zawierającą elementy typu `Entry<K, V>`. Stwórz metody do pobierania wartości związanych z kluczem, do dodawania wartości dla klucza oraz do usuwania klucza.
- [Zadanie 4] - W poprzednim ćwiczeniu zmień `Entry` w klasę zagnieżdżoną. Czy taka klasa powinna być uogólniona?
- [Zadanie 5] - Rozważ taki wariant metody swap, w którym tablica może być uzupełniana za pomocą tablicy ze zmienną liczbą parametrów (vararg):
```
private static <T> T[] swap(int i, int j, T... values) {
    T temp = values[i];
    values[i] = values[j];
    values[j] = temp;
    return values;
}
```
Następnie popatrz na wywołanie
```
Double[] values = Arrays.swap(0, 1, 1.5, 2, 3);
```
Jaki komunikat o błędzie otrzymałeś? Następnie wywołaj:
```
Double[] values = Arrays.<Double>swap(0, 1, 1.5, 2, 3);
```
Czy komunikat o błędzie wygląda lepiej? Co zrobisz, by naprawić ten problem?
                
[Zadanie 1]: <ex01/Exercise1.java>
[Zadanie 2]: <ex02/Exercise2.java>
[Zadanie 3]: <ex03/Exercise3.java>
[Zadanie 4]: <ex04/Exercise4.java>
[Zadanie 5]: <ex05/Exercise5.java>
