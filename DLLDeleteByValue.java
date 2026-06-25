class DNode {
    int data;
    DNode prev, next;

    DNode(int data) {
        this.data = data;
    }
}

public class DLLDeleteByValue {

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

    void deleteByValue(int value) {

        DNode temp = head;

        while (temp != null && temp.data != value)
            temp = temp.next;

        if (temp == head) {
            head = head.next;

            if (head != null)
                head.prev = null;

            return;
        }

        temp.prev.next = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;
    }

    void display() {
        DNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        DLLDeleteByValue obj = new DLLDeleteByValue();

        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);

        obj.deleteByValue(20);

        obj.display();
    }
}
