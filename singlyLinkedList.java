

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
    public void insertHead(int data) {

        // create a newNode
        Node newNode = new Node(data);

        // Condition
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        // it is very much mandotory  
        size++;
    }

    // INSERT NODE AT TAIL
    public void insertAtTail(int data) {
        // create new node
        Node newNode = new Node(data);

        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        // vary much mandotory
        size++;
    }

    // INSERT NODE AT ANY GIVEN INDEX
    public void inserAtIndex(int position, int data) {
        // given some condition
        if (position > size + 1 || position < 1) {
            System.out.println("Invalid position to enter data");
            return;
        }
        //    suppose i want to insert any middle index
        Node prevNode = head;
        // run a loop, to check how much step it need to go ahead and insert
        for (int i = 0; i < position - 2; i++) {
            // it's going incremental
            prevNode = prevNode.next;
        }

        // create a new node
        Node newNode=new Node(data);
        // link the prev and next node with the inserteed new node
        newNode.next=prevNode.next;
        prevNode.next=newNode;

        // increment the size of the linked list
        size++;
    }

    // TRAVARSE ON LINKEDLIST
    // PRINT A LINKED LIST
    public void travarseLinkedList(){
        // initialize the head into a temporary variable
        Node temp=head;

        // given condition
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    // GET THE SIZE OF THE LIST
    public int getSizeOfLinkedList(){
        return size;
    }

    // CHECK IS THE LIST EMPTY OR NOT
    public boolean isEmpty(){
        // given
        return head==null && tail==null;
    }


    // GET THE HEAD VALUE OR HEAD
    public int getHead(){
        // base case
        if(head==null){
            // nothing
            return -1;
        }
        else{
            return head.data;
        }
    }

    // GET THE TAIL VALUE OR TAIL
    public int getTail(){
        // base case
        if(tail==null){
            // nothing
            return -1;
        }
        else{
            return tail.data;
        }
    }

    // CLEAR A LINKED LIST
    // make a function 
    public void clearLinkedList(){
        head=null;
        tail=null;
        size=0;
    }

    // *****************************************************
    // SEARCH TARGET IN A LIST
    public boolean findTarget(int target){
        // start from head
        Node temp=head;

        while(temp!=null){
            // logic
            if(temp.data==target){
                return true;
            }
            else{
                temp=temp.next;
            }
        }
        return false;
      
    }


    // FINDING THE TARGET ELEMENT POSITION
    // 1-based indexing
    public int findTargetPosition(int target){
        Node temp=head;
        int position=1;     // positioan set 1 at initial stage

        while(temp!=null){
            if(temp.data==target){
                return position;
            }
            else{
                temp=temp.next;
                position++;
            }
        } 
        // position not found 
        return -1 ;
    }

    public static void main(String[] args) {

        // Create a linked list
        singlyLinkedList myList=new singlyLinkedList();

        // let's check one by one
        
        // check empty
        if(myList.isEmpty()){
            System.out.println("List is empty");
        }

        // get the size
        System.out.println("Size of the linked list: "+myList.getSizeOfLinkedList());

        // insert in head
        myList.insertHead(10);
        myList.insertHead(20);
        myList.insertHead(40);
        myList.travarseLinkedList();

        myList.inserAtIndex(1, 25);
        myList.travarseLinkedList();

        myList.insertAtTail(51);
        myList.travarseLinkedList();

        System.out.println(myList.size);

        // target find
        System.out.println(myList.findTarget(90));
        // target position found
        System.out.println("Target find Position: "+myList.findTargetPosition(10));
        
    }
}
