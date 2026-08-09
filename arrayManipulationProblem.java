/**
 * arrayManipulationProblem
 */
public class arrayManipulationProblem {

    // Reverse an array, another method (two pointer technique)
    /*static void reverseArray(int arr[]){
        
        int i=0;
        int j=arr.length-1;
        // termination condition
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;

            j--;
        }

        for(int arrElem:arr){
            System.out.print(arrElem+" ");
        }
    }*/

    // -------------------------------------------

    // rightShift by 1 array elements
 /*  static void shiftRightArray(int arr[]){
        
        int right=arr.length-1;
        int temp=arr[right];

        for(int i=right;i>0;i--){
            arr[i]=arr[i-1];

        }
        arr[0]=temp;
    }
 */

// ---------------------------------------------

    





    public static void main(String[] args) {
        
        // reverse an array, one kind of method
       /*int arr[]={2,9,4,8,7};
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }*/
        
        // call the function
        /*int arr[]={2,4,6,8,10};
        reverseArray(arr);*/

        // call the function
        /*int arr[]={10,20,30,40,50,60};
        shiftRightArray(arr);
        for (int k:arr){
            System.out.print(k+" ");
        }*/









    }
}