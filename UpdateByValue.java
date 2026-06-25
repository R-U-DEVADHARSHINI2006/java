package itjava.example;

class DNode {
    int data;
    DNode prev, next;

    DNode(int data) {
        this.data = data;
    }
}

public class UpdateByValue {

    DNode head;

    void insertAtEnd(int data) {
        DNode newNode = new DNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        DNode temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    void updateByValue(int oldValue, int newValue) {

        DNode temp = head;

        while (temp != null) {

            if (temp.data == oldValue) {
                temp.data = newValue;
                return;
            }

            temp = temp.next;
        }
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

        UpdateByValue dll = new UpdateByValue();

        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);

        dll.updateByValue(20, 99);

        dll.display();
    }
}
