//CIRCULAR LINKEDLIST

class CircularLinkedList {
    private Node head = null;
    private Node tail = null;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }


    public void remove(int data) {
        if (head == null) return;

        Node current = head;
        Node previous = tail;
        boolean found = false;

        do {
            if (current.data == data) {
                found = true;
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = previous;
                    tail.next = head;
                } else {
                    previous.next = current.next;
                }
                break;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println(" not found.");
        }
    }


    public boolean contains(int data) {
        if (head == null) return false;

        Node current = head;
        do {
            if (current.data == data) return true;
            current = current.next;
        } while (current != head);

        return false;
    }


    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }


    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();

        list.remove(20);
        list.printList();

        System.out.println(list.contains(10));
        System.out.println(list.contains(20));
    }
}
