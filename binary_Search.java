public class binary_Search {

    static int binarySearchTechnique(int arr[],int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int mid=(start+end)/2;

        // how much time loop run
        while(start<=end){
            // check
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{       //target<arr[mid]
                end =mid-1;
            }   
            mid=(start+end)/2;
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[]={10,20,30,31,32,33,41,42,50,60,70,80,90};
        int target=32;
        int ans=binarySearchTechnique(arr, target);
        System.out.println("Target is found at index: "+ans);
        
    }
    
}
