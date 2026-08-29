
public class circularLL {

    static class Node {

        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public circularLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // SINGLY CIRCULAR LINKED LIST
    // insert at HEAD
    public void insertHead(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;

            // Circular connection
            tail.next = head;
        } else {
            // simple logic
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

        size++;
    }

    // insert at TAIL
    public void insertAtTail(int data){
        Node newNode=new Node(data);

        if(head==null && tail==null){
            head=newNode;
            tail=newNode;

            // circular pattern
            tail.next=head;
        }
        else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }

        size++;
    }

    // insert at POSITION
    public void insertAtPosition(int position,int data){
        // create a new Node
        Node newNode= new Node(data);

        if(position<1 && position>size+1){
            System.out.println("Not Possible");
            return;
        }
        if(position==1){
            insertHead(data);
            return;
        }
        if(position==size){
            insertAtTail(data); 
        }

        // define node
        Node previous=head;
        for(int i=1;i<position-1;i++){
            previous=previous.next;
        }
        // link them
        newNode.next=previous.next;
        previous.next=newNode;
 
        // increment the size
        size++;
    }


    // travarse a singly LL
    public void travarseSinglyLL(){
        if(head==null){
            System.out.println("Not possible travarse");
            return;
        }
        // let the main trick begin
        Node temp=head;
        do { 
            System.out.println(temp.data+"->");// this will be run atleast once without checking any condition.
            temp=temp.next;     

        } while (temp!=head);   // now its start check condition
    }

    // search target in a linked list
    public boolean seatchTarget(int target){
        if(head==null){
            System.out.println("Not possible");
            return false;
        }

        Node temp=head;

        do { 
            if(target==temp.data){
                return true;
            }
            else{
                temp=temp.next;
            }
        } while (temp!=head);

        return false;
    }

    // delete head
    public void deleteHead(){
        // check empty or not
        if(head==null){
            System.out.println("Not possible");
            return ;
        }
        if(head==tail){
            head=null;
            tail=null;
            size=0;
            return;
        }

        // if more than one node in LL
        Node temp=head;     // store head in a temprary variable

        head=head.next;     // shift the existing head to its next node
        // maintain circular way
        tail.next=head;     // connect the tail node with the latest shifted head. 

        temp.next=null;     // finally assign null the temporary head, and java garbage collectector remove it

        // decrese
        size--;
    }

    // delete TAIL
    public void deletTail(){
        if(head==null){
            System.out.println("Not possible");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            size=0;
            return;
        }

        Node temp=head;
        for(int i=1;i<size-1;i++){
            head=head.next;
        }
        // tail.next=null;
        tail=temp;

        tail.next=head;

        size--;
    }

    // delete node at given position
    public void deleteBasedPosition(int position){
        if(position<1 || position>size+1){
            System.out.println("Not possible");
            return ;
        }
        if(position==1){
            deleteHead();
            return;
        }
        if(position==size){
            deletTail();
            return;
        }

        // if in any middle position then
        Node prevNode=head;
        for(int i=1;i<position-1;i++){
            prevNode=prevNode.next;
        }
        // define the other's variable
        Node currNode=prevNode.next;
        Node nextNode=currNode.next;

        // now link each other
        prevNode.next=nextNode;
        currNode.next=null;

        // decrease
        size--;
    }

    public static void main(String[] args) {

    }
}
