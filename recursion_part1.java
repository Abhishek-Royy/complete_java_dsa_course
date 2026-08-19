
public class recursion_part1 {

    // Tail recursion simple example
    /*static void printHello(int n){
        // base case
        if(n==0){
            return;
        }
        // processing work
        System.out.println("Hello Guys");
        // recursive call
        printHello(n-1);
    }*/
    // calculate factorial
    /*  static int calculateFactorial(int n){
        if(n==0){
            return 1;
        }
        return n*calculateFactorial(n-1);
    }*/
    // print 1 to n using recursion
    /*static void print1toN(int n, int count){
        // base case(count er value n er value theke boro holei stop)
        if(count>n){
            return;
        }

        // processing
        System.out.println(count);
        count ++;

        // recursive call
        print1toN(n, count);


    }*/
    // print array element
    /*static void printArray(int arr[],int i){
        if(i>=0){
            return;
        }

        System.out.print(arr[i]+" ");
        printArray(arr, i+1);

    }*/
    // find max element in array
    /*static void findMaxElem(int arr[],int i,int max){

       
        if(i>=arr.length){
              System.out.print("Max Value: "+max);
            return;
        }
        if(arr[i]>max){
            max=arr[i];
        }
   

        findMaxElem(arr, i+1,max);

    }*/
    // find the target element in array
    /*static void findTargetElement(int arr[],int i,int target){
        if(i>=arr.length){
            System.out.println("Target not found");
            return;
        }

        if(arr[i]==target){
            System.out.println("Target found at index: "+i);
            return;
        }

        findTargetElement(arr, i+1, target);
    }*/
    // how much time a target element occur in the array
    static void targetElemOccur(int arr[], int target, int count, int i) {
        if (i >= arr.length) {
            System.out.println("Total Occurance: " + count);
            return;
        }

        if (arr[i] == target) {
            count++;
        }

        targetElemOccur(arr, target, count, i + 1);
    }

    // print digit
    static void printDigit(int n) {
        if (n == 0) {
            return;
        }

        int digit = n % 10;
        n = n / 10;
        printDigit(n);

        System.out.println("Digit: " + digit);

    }

    // Binary search using Recursion
    static int binarySearch(int arr[],int s,int e, int target){
        if(s>e){
            return -1;
        }
        
        int mid=s+(e-s)/2;

        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            e=mid-1;
        }
        else{
            s=mid+1;
        }

        return binarySearch(arr, s, e, target);

    }


    public static void main(String[] args) {
        // printHello(5);

        // System.out.println(calculateFactorial(5));
        // // ----------------------------
        // print1toN(5, 1);
        // ----------------------------
        /*int arr[]={10,20,30,40,50};
        int i=0;
        printArray(arr, i);*/
        // -----------------------------
        // int arr[]={10,20,30,40,50};
        // int i=0;
        // int target=30;
        // findTargetElement(arr, i, target);
        // int max=Integer.MIN_VALUE;
        // findMaxElem(arr, i,max);
        //   ------------------------------------
        // int arr[] = {10, 50, 10, 40, 60, 10, 80, 10};
        // int i = 0;
        // int count = 0;
        // int target = 10;

        // targetElemOccur(arr, target, count, i);

        // ---------------------------------------
        printDigit(153);
        // ----------------------------------------
        int arr[]={10,55,41,11,25,65,9};
        int s=0;
        int e=arr.length-1;
        int target=25;

        System.out.println("Found at index: "+binarySearch(arr, s, e, target));
    }
}
