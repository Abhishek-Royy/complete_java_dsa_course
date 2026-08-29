
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

    // insert at HEAD
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


    // insert node at TAIL
    public void insertAtTail(int data){
        Node newNode=new Node(data);

        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }

    // insert at any Given POSITION
    public void insertAtPosition(int position,int data){
        // check some condition
        if(position<1 || position>size+1){
            System.out.println("Failed to insert");
            return;
        }
        if(position==1){
            insertAtHead(data);
            return;
        }
        if(position==size+1){
            insertAtTail(data);
            return;
        }

        // let's declare a variable
        Node temp=head;

        // run a loop
        for(int i=1;i<=position-1;i++){
            temp=temp.next;
        }

        // lest declare some variable
        Node prevNode=temp;
        Node nextNode=prevNode.next;
        Node newNode=new Node(data);
        
        // lets link each other(visulaize the link in pen paper)
        newNode.prev=prevNode;
        prevNode.next=newNode;

        newNode.next=nextNode;
        nextNode.prev=newNode;

        // at the end increase the size
        size++;

    }

    // *******************************************
    // print the List FORWARD direction
    public void printList(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }


    // print the list in BACKWARD direction
    public void printBackward(){
        Node pointer=tail;

        while(pointer!=null){
            System.out.print("<-"+pointer.data);
            pointer=pointer.prev;
        }
        System.out.println();
    }

    // ****************************************
    // check the TARGET element present or not
    public boolean findTarget(int target){
        Node temp=head;
        while(temp!=null){
            if(temp.data==target){
                return true;
            }
            else{
                temp=temp.next;
            }
        }  
        return false; 
    }

    public void deleteHead(){
        if(head==null || tail==null){
            System.out.println("Not possible , Empty");
        }
        if(head==tail){
            head=null;
            tail=null;
            size=0;
            return;
        }

        // r jodi 1 er besi node thake
        head=head.next;
        head.prev=null;


        // decrease the size
        size--;
    }

    // ------------------------------------------
    public void deleteTail(){
        if(tail==null){
            System.out.println("Empty or not possible");
            return;
        }

        if(head==tail){
            head=null;
            tail=null;
            size=0;
        }

        tail=tail.prev;

        tail.next=null;

        size --;
           
    }

    // delete  Node from any given position\
    public void deleteNodePosition(int position){
        if(position<1 || position>size+1){
            System.out.println("Position Invalid , Not possible");
            return;
        }

        if(position==1){
            deleteHead();
            return;
        }
        if(position==size){
            deleteTail();
            return;
        }

        // if positionmis in middle
        Node currNode=head;
        for(int i=1;i<position;i++){
            currNode=currNode.next;
        }

        // make more two variable
        Node prevNode=currNode.prev;
        Node nextNode=currNode.next;

        // let link them
        prevNode.next=nextNode;
        nextNode.prev=prevNode;
        currNode.next=null;
        currNode.prev=null;

        // decrese the size
        size--;

    }

    public static void main(String[] args) {

        doublyLL list=new doublyLL();

        // ********************************
        list.insertAtHead(10);
        list.insertAtHead(40);
        list.insertAtHead(28);
        // ********************************
        list.insertAtTail(55);
        list.insertAtTail(98);
        list.insertAtTail(67);
        // *********************************
        list.insertAtPosition(3, 36);

        // print
        list.printList();
        list.printBackward();
        // target elem Find
        System.out.println(list.findTarget(98));
        System.out.println(list.findTarget(198));
        // ******************
        list.deleteHead();
        list.printList();
       
        list.deleteTail();
        list.printList();

        list.deleteNodePosition(3);
        list.printList();

    }
}
