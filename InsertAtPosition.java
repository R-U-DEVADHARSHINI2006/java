package itjava.example;

class DNode {
    int data;
    DNode prev, next;

    DNode(int data) {
        this.data = data;
    }
}

public class InsertAtPosition {

    DNode head;

    void insertAtEnd(int data) {
        DNode newNode = new DNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        DNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    void insertAtPosition(int pos, int data) {

        DNode newNode = new DNode(data);

        if (pos == 1) {
            newNode.next = head;

            if (head != null)
                head.prev = newNode;

            head = newNode;
            return;
        }

        DNode temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;
    }

    void display() {
        DNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertAtPosition dll = new InsertAtPosition();

        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);

        dll.insertAtPosition(2, 15);

        dll.display();
    }
}
