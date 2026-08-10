

public class dutchNationalFlagAlgo {
    static void dutchNationalAlgo(int arr[]){
        // define variable
        int low=0;
        int mid=0;
        int high=arr.length-1;

        // now how long the loop continue
        while(mid<=high){
            // Condition
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;

                // move on karo
                low++;
                mid++;
            }
            // another condition
            else if(arr[mid]==1){
                // all god, move forward
                mid++;
            }
            // last possible condfition
            // arr[mid]==2
            else{  
                 int temp=arr[high];
                 arr[high]=arr[mid];
                 arr[mid]=temp;
                
                //  backwrad aoo high
                high--;

            }
        }
        // print the sorted array
        for(int elem:arr){
            System.out.print(elem+" ");
        }
    }
    public static void main(String[] args) {

        int arr[]={1,0,0,2,1,2};
        
        dutchNationalAlgo(arr);
    }
}
