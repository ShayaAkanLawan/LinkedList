import java.util.Objects;

class SinglyLinkedList extends LinkedList {
    @Override
    boolean isEmpty() {
        return head == null;
    }

    @Override 
    void append (Object data) {
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }
    
    @Override
    void prepend(Object data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAt (int index, Object data){
        Node newNode = new Node(data);
        Node current = head;

        if (index == 0){
            prepend(data);
        }

        for (int i = 0; i < (index - 1); i++) {
            current = current.next;
        }

        Node after = current.next;
        current.next = newNode;
        current.next.next = after;
    }

    @Override 
    void removeTail() {
        if (head == null){
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    @Override 
    void removeHead() {
        if (head == null){
            return;
        }
        head = head.next;
    }

    Object search(Object data) {
        Node temp = head;

        while (temp != null) {
            if (Objects.equals(temp.data, data)) {
                return temp.data;
            }
            temp = temp.next;
        }

        System.out.println("Data tidak ditemukan.");
        return null;
    }

    @Override 
    void display() {
        Node current = head;

        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}