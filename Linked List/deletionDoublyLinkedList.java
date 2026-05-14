
public class deletionDoublyLinkedList {

    int size;
    Node head;

    deletionDoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Data -> " + temp.data);
            temp = temp.next;
        }
    }

    public void testInsertion(int data) {
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
        newNode.prev = temp;
        size++;
    }

    public void deletionAtPosition(int position) {
        if (position > size + 1 && position <= 0) {
            System.out.println("Wrong position");
        }
        if (position == 1) {
            deleteAtHead();
        } else if (position == size + 1) {
            deleteAtTail();
        } else {
            int counter = 1;
            Node temp = head;
            Node prevNode = null;
            while (counter < position - 1) {
                counter++;
                temp = temp.next;
                prevNode = temp;
            }
            Node nextNode = temp.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            temp.prev = null;
            temp.next = null;

        }
    }

    public void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            System.out.println("Deleted at head");
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteAtTail() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            System.out.println("Deleted at head");
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    public static void main(String[] args) {
        deletionDoublyLinkedList obj = new deletionDoublyLinkedList();
        obj.testInsertion(5);
        obj.testInsertion(4);
        obj.testInsertion(6);
        obj.testInsertion(9);
        obj.testInsertion(10);
        obj.deletionAtPosition(5);
        obj.printlist();
    }

}

class Node {

    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}
