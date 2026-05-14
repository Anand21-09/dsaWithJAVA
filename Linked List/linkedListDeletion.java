
class Node {

    int data;
    Node next;

    Node() {
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedListDeletion {

    Node head;
    int size;

    linkedListDeletion() {
        this.head = null;
        this.size = 0;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println("data -> " + temp.data);
            temp = temp.next;
        }
    }

    public void testInsertion(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
        System.out.println("Inserted");
    }

    public void deleteAtposition(int position) {
        if (position > size + 1 && position < 0) {
            System.out.println("wrong input");
            return;
        }
        if (position == 1) {
            deleteAtHead();
        } else if (position == size + 1) {
            deleteAtTail();
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;

            System.out.println("Deleted at position " + position);
        }
    }

    public void deleteAtHead() {
        //Node temp = head;
        if (head == null) {
            System.out.println("no need to delete");
            return;
        }
        head = head.next;
        //temp.next = null;
        size--;

        System.out.println("deleted at head");
    }

    public void deleteAtTail() {
        if (head == null) {
            System.out.println("no need to delete");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            System.out.println("Deleted last node");
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
        System.out.println("deleted at tail");
    }

    public static void main(String[] args) {
        linkedListDeletion obj = new linkedListDeletion();
        obj.testInsertion(5);
        obj.testInsertion(6);
        obj.testInsertion(2);
        obj.testInsertion(3);
        obj.testInsertion(8);
        obj.deleteAtposition(4);
        //obj.deleteAtHead();
        //obj.deleteAtTail();
        obj.display();
    }
}
