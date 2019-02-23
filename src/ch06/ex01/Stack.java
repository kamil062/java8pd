package ch06.ex01;

import java.util.ArrayList;
import java.util.Arrays;

public class Stack<E> {
    private ArrayList<E> stack = new ArrayList<>();

    public void push(E element){
        this.stack.add(element);
    }

    public E pop(){
        return this.stack.remove(this.stack.size() - 1);
    }

    public boolean isEmpty(){
        return this.stack.isEmpty();
    }

    @Override
    public String toString() {
        return Arrays.toString(this.stack.toArray());
    }
}
