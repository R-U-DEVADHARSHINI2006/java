package itjava.example;

class DNode {
    int data;
    DNode prev, next;

    DNode(int data) {
        this.data = data;
    }
}

public class Search {

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

    boolean search(int data) {

        DNode temp = head;

        while (temp != null) {

            if (temp.data == data)
                return true;

            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {

        Search dll = new Search();

        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);

        System.out.println(dll.search(20));
        System.out.println(dll.search(100));
    }
}
