package ch06.ex04;

/*
W poprzednim ćwiczeniu zmień Entry w klasę zagnieżdżoną. Czy taka klasa powinna
być uogólniona?
*/

public class Exercise4 {
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
