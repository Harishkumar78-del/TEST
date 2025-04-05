lINKEDLIST WITH ENQUESUE DEQUEUE AND PEEK

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> list;


    public Queue() {
        list = new LinkedList<>();
    }

    public void enqueue(T item) {
        list.addLast(item);
    }


    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot dequeue.");
        }
        return list.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot peek.");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }


    public String toString() {
        return list.toString();
    }


    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Queue after enqueue: " + queue);

        System.out.println("Peek: " + queue.peek());

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Queue after dequeue: " + queue);

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
