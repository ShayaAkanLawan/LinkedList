class Node {
    Object data;
    Node next;

    Node(Object data){
        this.data = data;
        this.next = null;
    }
}

abstract class LinkedList {
    Node head;
    Node tail;
    int total;

    abstract boolean isEmpty();
    abstract void append(Object data);
    abstract void prepend(Object data);
    abstract void removeTail();
    abstract void removeHead();

    abstract void display();
}
