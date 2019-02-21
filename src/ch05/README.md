# **Java 8 Podręcznik doświadczonego programisty**

## **Rozdział 5** - Wyjątki, asercje i logi

- [Zadanie 1] - Napisz metodę `public Arraylist<Double>readValues(String filename) throws ...`, która odczyta plik zawierający liczby zmiennoprzecinkowe. Wyrzuć odpowiednie wyjątki, jeśli nie będzie możliwe otwarcie pliku lub jeśli trafisz na dane niebędące liczbami zmiennoprzecinkowymi.
- [Zadanie 2] - Napisz metodę `public double sumOfValues(String filename) throws...` wywołującą poprzednią metodę i zwracającą sumę wartości w pliku. Przekazuj wszystkie wyjątki do kodu wywołującego tworzoną metodę.
- [Zadanie 3] - Napisz program wywohljący poprzednią metodę i wyświetlający wynik. Przechwyć wyjątki i dostarcz użytkownikowi informacje na temat błędów.
- [Zadanie 4] - Powtórz poprzednie ćwiczenie, ale bez użycia wyjątków. Zamiast tego niech `readValues` i `sumOfValues` zwracają jakieś kody błędów.
- [Zadanie 5] - Zaimplementuj metodę zawierającą kod klas `Scanner` i `PrintWriter` z podrozdziału 5.1.5, "Wyrażenie try z zadeklarowanymi zasobami". Nie używaj jednak wyrażenia `try` z zadeklarowanymi zasobami. Zamiast tego użyj zwykłych klauzul `catch`. Upewnij się, że zamykasz oba obiekty, jeśli zostały poprawnie utworzone. Musisz wziąć pod uwagę następujące sytuacje:
                • konstruktor klasy `Scanner` wyrzuca wyjątek;
                • konstruktor klasy `PrintWriter` wyrzuca wyjątek;
                • metoda `hasNext`, `next` lub `println` wyrzuca wyjątek;
                • `out.close()` wyrzuca wyjątek;
                • `in.close()` wyrzuca wyjątek.
- [Zadanie 6] - Podrozdział 5.1.6, "Klauzula finally", zawiera przykład błędnego wyrażenia `try` z klauzulami `catch` i `finally`. Popraw ten kod poprzez: a) przechwytywanie wyjątku w klauzuli `finally`, b) wyrażenie `try/catch` zawierające zagnieżdżone wyrażenie `try/catch` oraz c) wyrażenie `try` z zadeklarowanymi zasobami oraz klauzulę `catch`. 
- [Zadanie 11] - Porównaj wykorzystanie `Objects.requireNonNull(obj)` i `assert obj ! = null`. Podaj przykład odpowiedniego wykorzystania obu tych wyrażeń.
- [Zadanie 12] - Napisz metodę `int min(int[] values)`, która przed zwróceniem najmniejszej wartości sprawdza dodatkowo za pomocą asercji, czy rzeczywiście ta wartość jest mniejsza albo równa wszystkim wartościom w tablicy. Użyj metody pomocniczej lub, jeśli zajrzałeś już do rozdziału 8., metody `Stream.allMatch`. Wywołuj metodę w pętli dla dużej tablicy i zmierz czas wykonania kodu z asercją włączoną, wyłączoną i usuniętą.          
- [Zadanie 13] - Zaimplementuj i przetestuj filtr rekordów rejestrowanych danych, który odrzuci rekordy zawierające brzydkie słowa, takie jak seks, narkotyki i C++.
                
[Zadanie 1]: <ex01/Exercise1.java>
[Zadanie 2]: <ex02/Exercise2.java>
[Zadanie 3]: <ex02/Exercise2.java>
[Zadanie 4]: <ex04/Exercise4.java>
[Zadanie 5]: <ex05/Exercise5.java>
[Zadanie 6]: <ex06/Exercise6.java>
[Zadanie 11]: <ex11/Exercise11.java>
[Zadanie 12]: <ex12/Exercise12.java>
[Zadanie 13]: <ex13/Exercise13.java>
