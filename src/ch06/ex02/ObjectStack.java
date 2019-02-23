package ch06.ex02;

import java.util.Arrays;

public class ObjectStack<E> {
    private Object[] stack = new Object[2];
    private int size = 0;

    public void push(Object element){
        if(this.size + 1 > this.stack.length){
            Object[] newStack = new Object[this.stack.length * 2];
            for(int i = 0; i < this.stack.length; i++)
                newStack[i] = this.stack[i];
            this.stack = newStack;
        }

        this.stack[this.size++] = element;
    }

    public Object pop(){
        if(this.size - 1 >= 0)
            return this.stack[--this.size];
        else
            return null;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(this.stack, 0, this.size));
    }
}
