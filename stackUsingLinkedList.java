public class stackUsingLinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    public stackUsingLinkedList(){
        this.top = null;
    }

    public void push(int data){
        Node newNode=new Node(data);
        if(top==null){
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }

    // remove the element also return the element
    public int pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int value=top.data;
        top=top.next;
        return value;
    }

    // peek element, means return the top most element
    public int peak(){
        if(top==null){
            System.out.println("Empty");
            return -1;
        }
        else{
            // return the top most element
            return top.data;
        }
    }


    // check a stack empty or not
    public boolean isEmpty(){
        return top==null;
    }


    // Display the stack
    public void displayStackData(){
        Node temp=top;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {

        stackUsingLinkedList stack =new stackUsingLinkedList();

        // System.out.println(stack.isEmpty());

        stack.push(10);
        stack.push(30);
        stack.push(20);
        stack.push(40);
        stack.push(80);
        stack.displayStackData();
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        stack.displayStackData();
        System.out.println(stack.peak());
        System.out.println(stack.isEmpty());
        
        
    }
}
