class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class coding {

    Node head;
    int size;

    coding() {
        this.head = null;
        this.size = 0;
    }

    // ================= INSERT METHODS (for testing) =================

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        size++;
    }

    // ================= DISPLAY =================

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // ================= DELETION METHODS =================

    // 1. Delete at Beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        size--;
    }

    // 2. Delete at End
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        size--;
    }

    // 3. Delete at Position
    public void deleteAtPosition(int position) {

        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }

    // 4. Delete by Value
    public void deleteByValue(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == value) {
            head = head.next;
            size--;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found");
            return;
        }

        temp.next = temp.next.next;
        size--;
    }

    // ================= MAIN METHOD =================

    public static void main(String[] args) {

        coding list = new coding();

        // Insert elements
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        System.out.println("Original List:");
        list.display();

        // Delete at beginning
        list.deleteAtBeginning();
        System.out.println("\nAfter deleting at beginning:");
        list.display();

        // Delete at end
        list.deleteAtEnd();
        System.out.println("\nAfter deleting at end:");
        list.display();

        // Delete at position (index 1)
        list.deleteAtPosition(1);
        System.out.println("\nAfter deleting at position 1:");
        list.display();

        // Delete by value
        list.deleteByValue(30);
        System.out.println("\nAfter deleting value 30:");
        list.display();
    }
}