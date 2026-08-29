

public class circularDoublyLL {

    static class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public circularDoublyLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // insertAt HEAD
    public void insertHead(int data){
        Node newNode=new Node(data);

        if(head==null && tail==null){
            head=newNode;
            tail=newNode;

            // circular connection
            head.prev=tail;
            tail.next=head;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;

            tail.next=head;
            head.prev=tail;
        }

        size++;
    }

    // insertAt TAIL
    public void inserTail(int data){
        Node newNode=new Node(data);

        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
            // circular maintain
            head.prev=tail;
            tail.next=head;
        }
        else{
            newNode.prev=tail;
            tail.next=newNode;

            tail=newNode;

            tail.next=head;
            head.prev=tail;
        }
        size++;
    }

    // inser at POSITION
    public void insertPosition(int position,int data){
        if(position< 1|| position>size+1){
            System.out.println("impossible");
            return;
        }
        if(position==1){
            insertHead(data);
            return;
        }
        if(position==size){
            inserTail(data);
            return;
        }

        Node newNode=new Node(data);
        Node temp=head;
        for(int i=1;i<position-1;i++){
            temp=temp.next;
        }

        Node prevNode=temp;
        // newNode=prevNode.next;
        Node nextNode=prevNode.next;

        // link
        // newNode.prev=prevNode;
        // prevNode.next=newNode;
        newNode.next=nextNode;
        nextNode.prev=newNode;

        size++;
    }



    public static void main(String[] args) {

    }
}
