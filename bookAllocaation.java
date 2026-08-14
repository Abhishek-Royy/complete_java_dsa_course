public class bookAllocaation {


    static boolean isValidMid(int arr[],int k,int mid){
        int pages=0;
        int studentStartCount=1;

        for(int i=0;i<arr.length;i++){
            if(pages+arr[i]<=mid){
                pages+=arr[i];
            }
            else{
                studentStartCount++;
                pages = arr[i];
            }

            // validation
            if(studentStartCount>k || arr[i]>mid){
                return false;
            }
        }
        return true;
    }

    static int findPages(int arr[],int k){
        int n=arr.length;
        if(n<k){
            return -1;
        }

        int start=1;
        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int end=sum;
        int ans=-1;


        while(start<=end){
            int mid=start+(end-start)/2;

            // very much important point
            if(isValidMid(arr,k,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }


        }
        return ans;

    }
    

    public static void main(String[] args) {
        
        int k=2;
        int arr[]={10,20,30,40,50};

        int ans=findPages(arr, k);

        System.out.println(ans);

    }
}
