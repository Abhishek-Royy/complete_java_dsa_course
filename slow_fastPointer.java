
public class slow_fastPointer {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public slow_fastPointer() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // insert Node
    public void insertNode(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;

    }

    // letsb implement the Algorithm
    public int findMid() {
        Node slow = head;
        Node fast = head;

        // how much time the loop will run
        while (fast != null) {
            // increment the fast two time
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;

                // increment the slow one time
                slow = slow.next;

            }
        }
        return slow.data;
    }

    public static void main(String[] args) {

        slow_fastPointer list = new slow_fastPointer();

        list.insertNode(10);
        list.insertNode(40);
        list.insertNode(30);
        list.insertNode(80);
        list.insertNode(20);
        list.insertNode(90);

        System.out.println("Middle is: " + list.findMid());

    }
}
