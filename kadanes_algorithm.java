/**
 * kadanes_algorithm
 */
public class kadanes_algorithm {

    static int maximumSubarray(int arr[]){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }   

    public static void main(String[] args) {

        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int result=maximumSubarray(arr);
        
        System.out.print("Maxumum Subarray Sum: "+result);
    }
}   