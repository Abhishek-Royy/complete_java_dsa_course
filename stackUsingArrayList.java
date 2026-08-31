
import java.util.ArrayList;

public class stackUsingArrayList {

    ArrayList <Integer> stack=new ArrayList<>();

    // push any data
    public void push(int data){
        stack.add(data);
    }

    // pop
    public int pop(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return stack.remove(stack.size()-1);
        }
    }

    // peek
    public int peak(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return stack.get(stack.size()-1);
        }
    }

     // Dsiplay the stack
    public void displayStackData(){
        for(int i=stack.size()-1;i>=0;i--){
            System.out.print(stack.get(i)+"-->");
        }
        System.out.println();
    }

   
    // public void display(){
    //     System.out.println(stack);
    // }

    public static void main(String[] args) {
        
        stackUsingArrayList s =new stackUsingArrayList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.displayStackData();
        System.out.println(s.peak());
        System.out.println(s.pop());
        s.displayStackData();
        
    }
}
