package ch06.ex03;

/*
Zaimplementuj klasę Table<K, V>, która zarządza tablicą typu ArrayList zawierającą
elementy typu Entry<K, V>. Stwórz metody do pobierania wartości związanych
z kluczem, do dodawania wartości dla klucza oraz do usuwania klucza.
*/

public class Exercise3 {
    public static void main(String[] args){
        Table<Integer, String> people = new Table<>();
        people.add(0, "Jaś");
        people.add(1, "Maciek");
        people.add(2, "Tomek");
        System.out.println(people);
        for(int i = 0; i < 3; i++)
            System.out.println(people.get(i) + ", " + people.remove(i));
        System.out.println(people);

    }
}
