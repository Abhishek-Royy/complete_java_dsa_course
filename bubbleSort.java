public class bubbleSort {

    static void bubbleSort(int arr[]){

        int n=arr.length;

        // outer Loop(how many iteration gone)
        for(int i=0;i<n-1;i++){
            //inner loo(how many swap and pass need)
            for(int j=0;j<n-i-1;j++){
                // check for swap
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[]args){

        int arr[]={3,1,6,5};
        bubbleSort(arr);

        for(int elem:arr){
            System.out.print(elem+"  ");
        }

    }
}
