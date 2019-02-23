package ch06.ex01;

/*
Zaimplementuj klasę EStack<E>, która zarządza tablicą typu ArrayList zawierającą
elementy typu E. Utwórz metody: push, pop i isEmpty.
*/

public class Exercise1 {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        for(int i = 1; i <= 3; i++) {
            integerStack.push(i);
            System.out.println(integerStack);
        }
        while(!integerStack.isEmpty())
            System.out.println(integerStack.pop() + " " + integerStack);
    }
}
