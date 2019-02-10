package ch03.ex04;

/*
Zaimplementuj statyczną metodę of w klasie IntSequence, która zwraca ciąg
parametrów. Na przykład IntSequence.of(3. l, 4, l, 5. 9) zwraca ciąg sześciu
wartości. Dodatkowe punkty możesz dostać za zwrócenie instancji wewnętrznej
klasy anonimowej.
*/

public class Exercise4 {
    public static void main(String[] args){
        IntSequence digitSequence = IntSequence.of(3, 1, 4, 1, 5, 9);

        while(digitSequence.hasNext())
            System.out.println(digitSequence.next());
    }
}
