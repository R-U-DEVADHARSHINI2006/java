package itjava.example;

class DNode {
    int data;
    DNode prev, next;

    DNode(int data) {
        this.data = data;
    }
}

public class DeleteByPos {

    DNode head;

    int countNode() {
        int count = 0;
        DNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void deleteByPos(int pos) {

        int size = countNode();

        if (head == null) {
            System.out.println("List Empty");
            return;
        }

        if (pos < 1 || pos > size) {
            System.out.println("Invalid Position");
            return;
        }

        if (pos == 1) {
            head = head.next;

            if (head != null)
                head.prev = null;

            return;
        }

        DNode temp = head;

        for (int i = 1; i < pos; i++)
            temp = temp.next;

        temp.prev.next = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;
    }
}
