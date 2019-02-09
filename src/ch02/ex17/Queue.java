package ch02.ex17;


import java.util.ArrayList;

public class Queue {
    public static class Node {
        private String value;
        private Node next;

        public Node() {
            this("");
        }

        public Node(String value){
            this.value = value;
            this.next = null;
        }

        public String getValue() { return this.value; }
        public void setValue(String value) { this.value = value; }

        public Node getNext() { return this.next; }
        public void setNext(Node next) { this.next = next; }
    }
    private Node head = null;

    private ArrayList<String> toList(){
        ArrayList<String> list = new ArrayList<>();
        Node curr;

        for(curr = head; curr != null && curr.getNext() != null; curr = curr.getNext())
            list.add(curr.getValue());
        if(curr != null) list.add(curr.getValue());

        return list;
    }

    private int count(){
        int count = 0;
        Node curr;

        for(curr = head; curr != null && curr.getNext() != null; curr = curr.getNext(), count++);
        if(curr != null) count++;

        return count;
    }

    public void add(String value){
        if(this.head == null){
            this.head = new Node(value);
        } else {
            Node newNode = new Node(value);
            Node currentNode = this.head;
            while (true) {
                if(currentNode.getNext() == null){
                    currentNode.setNext(newNode);
                    break;
                } else {
                    currentNode = currentNode.getNext();
                }
            }
        }
    }

    public String remove(){
        String tmp = this.head.getValue();
        this.head = (count() <= 1) ? null : this.head.getNext();
        return tmp;
    }

    @Override
    public String toString(){
       return toList().toString();
    }
}
