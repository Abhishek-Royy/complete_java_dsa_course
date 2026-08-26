

/*
 * Here we implement a Singly Linked List with multiple operations:
 * insertion, deletion, peek by index, searching, etc.
 * BASIC -> ADVANCE
 */

public class singlyLinkedList {

    // Structure of a Node
    static class Node {

        // A node contains data and a reference to the next node
        int data;
        Node next;

        // Node constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked List variables
    private Node head;
    private Node tail;
    private int size;

    // declare the value of the node, in initial stage
    // Singly Linked List constructor
    public singlyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    // INSERT NODE AT HEAD
    public void insertHead(int data){

        // create a newNode
        Node newNode=new Node(data);

        // Condition
        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }

        // it is very much mandotory  
        size++;
    }

    // INSERT NODE AT TAIL
    public void insertAtTail(int data){
        // create new node
        Node newNode=new Node(data);

        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        // vary much mandotory
        size++;
    }

    public static void main(String[] args) {

        // Create a linked list
        singlyLinkedList list = new singlyLinkedList();

    }
}