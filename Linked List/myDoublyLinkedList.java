
class DoublyNode<T> {

    T data;
    DoublyNode<T> next;
    DoublyNode<T> prev;

    // public DoublyNode() {
    //     this.next = null;
    //     this.prev = null;
    // }
    public DoublyNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}

public class myDoublyLinkedList {

    DoublyNode<Integer> head;
    int size;

    myDoublyLinkedList() {
        head = null;
        size = 0;
    }

    public static void main(String[] args) {
        myDoublyLinkedList obj = new myDoublyLinkedList();
        obj.insertAtHead(5);
        obj.insertAtHead(9);
        obj.insertAtTail(10);
        obj.insertAtPosition(4, 2);
        obj.printList();
    }

    public void printList() {
        DoublyNode<Integer> temp = head;
        while (temp != null) {
            System.out.println("Data -> " + temp.data);
            temp = temp.next;
        }
    }

    public void insertAtHead(int data) {
        DoublyNode<Integer> newNode = new DoublyNode<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertAtTail(int data) {
        DoublyNode<Integer> newNode = new DoublyNode<>(data);
        DoublyNode<Integer> temp = head;
        if (head == null) {
            head = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        size++;
    }

    public void insertAtPosition(int data, int position) {
        DoublyNode<Integer> newNode = new DoublyNode<>(data);
        if (position > size + 1 || position <= 0) {
            System.out.println("Wrong Position");
            return;
        }
        if (position == 1) {
            insertAtHead(data);
            //return;
        } else if (position == size + 1) {
            insertAtTail(data);
            //return;
        } else {
            int counter = 1;
            DoublyNode<Integer> temp = head;
            while (counter < position - 1 && temp != null) {
                counter++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
            size++;
        }
    }

}
