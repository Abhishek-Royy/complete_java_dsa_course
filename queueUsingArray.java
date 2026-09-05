/**
 * queueUsingLL
 */
public class queueUsingArray {

    static class Queue{
            int size;
            int arr[];
            int rear=-1;
        Queue(int n){
            arr=new int[n];
            this.size=n;
        }


        public boolean isEmpty(){
            return rear==-1;
        }

        public boolean isFull(){
            return rear==size-1;
        }

        public void enqueue(int data){
         if(isFull()){
            System.out.println("Queue is full");
            return;
         }
         else{
            rear++;
            arr[rear]=data;
         }
        }


        public int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                int front=arr[0];
                for(int i=0;i<rear;i++){
                    // 1 step ahead
                    arr[i]=arr[i+1];
                }
                rear--;
                return front;
            }
        }


        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                return arr[0];
            }
        }


        // print the queue
        public void displayQueue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            for(int i=0;i<=rear;i++){
                System.out.print(arr[i]+"->");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.displayQueue();

        q.dequeue();
        q.displayQueue();
    }
}