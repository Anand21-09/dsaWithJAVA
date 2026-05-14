
public class myLinkedList {

    Node<Integer> head;
    int size;

    myLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public static void main(String[] args) {

        myLinkedList obj = new myLinkedList();

        obj.insertTail(10);
        obj.insertTail(20);
        obj.insertHead(5);
        obj.insertNode(15, 3);

        obj.printList();
    }

    public void printList() {

        Node<Integer> temp = head;

        while (temp != null) {
            System.out.println("data is -> " + temp.data);
            temp = temp.next;
        }
    }

    public void insertNode(int data, int position) {

        if (position > size + 1 || position <= 0) {
            System.out.println("wrong input");
            return;
        }

        if (position == 1) {
            insertHead(data);
        } else if (position == size + 1) {
            insertTail(data);
        } else {

            int counter = 1;

            Node<Integer> newNode = new Node<>(data);
            Node<Integer> temp = head;

            while (counter < position - 1 && temp != null) {
                counter++;
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;

            size++;

            System.out.println("Insertion successful at position " + position);
        }
    }

    public void insertHead(int data) {

        Node<Integer> newnode = new Node<>(data);

        if (head == null) {
            head = newnode;
            size++;
            System.out.println("Insertion at head is done");
            return;
        }

        newnode.next = head;
        head = newnode;

        size++;

        System.out.println("Insertion at head is done");
    }

    public void insertTail(int data) {

        Node<Integer> newnode = new Node<>(data);

        if (head == null) {
            head = newnode;
            size++;
            System.out.println("Insertion at tail is done");
            return;
        }

        Node<Integer> temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;

        size++;

        System.out.println("Insertion at tail is done");
    }
}

class Node<T> {

    T data;
    Node<T> next;

    Node() {
        this.next = null;
    }

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}
