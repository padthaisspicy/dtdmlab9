public class FractionLinkedList {
    private Node head;
    private int size;

    private class Node {
        Fraction data;
        Node next;

        Node(Fraction data) {
            this.data = data;
            this.next = null;
        }
    }

    public FractionLinkedList() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Fraction fraction) {
        Node newNode = new Node(fraction);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public Fraction get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public boolean contains(Fraction fraction) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(fraction)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void remove(Fraction fraction) {
        if (head == null) {
            return;
        }

        if (head.data.equals(fraction)) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        Node prev = null;
        while (current != null && !current.data.equals(fraction)) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
            size--;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data.toString()).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }
}
