package ch06.ex02;

/*
Zaimplementuj klasę EStack<E>, używając zwykłej tablicy do przechowywania
elementów. Jeśli to konieczne, powiększaj tablicę w metodzie push. Utwórz dwa
rozwiązania, jedno z tablicą E[], drugie z tablicą Object[]. Oba rozwiązania powinny
kompilować się bez ostrzeżeń. Które uważasz za lepsze i dlaczego?
*/

public class Exercise2 {
    public static void main(String[] args) {
        EStack<Integer> integerStack = new EStack<>();
        for(int i = 1; i <= 3; i++) {
            integerStack.push(i);
            System.out.println(integerStack);
        }
        while(!integerStack.isEmpty())
            System.out.println(integerStack.pop() + " " + integerStack);

        System.out.println("\n");

        ObjectStack<Integer> integerStack2 = new ObjectStack<>();
        for(int i = 1; i <= 3; i++) {
            integerStack2.push(i);
            System.out.println(integerStack2);
        }
        while(!integerStack2.isEmpty())
            System.out.println(integerStack2.pop() + " " + integerStack2);
    }
}
