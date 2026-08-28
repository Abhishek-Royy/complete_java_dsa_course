
/**
 * doublyLL
 */
public class doublyLL {

    static class Node {

        int data;
        Node prev;
        Node next;

        // define constructor
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

    }
    private Node head;
    private Node tail;
    private int size;

    // define anothe variable
    public doublyLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

// ***********************************************
    public void insertAtHead(int data){
        Node newNode=new Node(data);

        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }




    public static void main(String[] args) {

        doublyLL list=new doublyLL();

        list.insertAtHead(10);
        list.insertAtHead(40);
        list.insertAtHead(28);
        list.insertAtHead(88);
        list.insertAtHead(37);
        

    }
}
