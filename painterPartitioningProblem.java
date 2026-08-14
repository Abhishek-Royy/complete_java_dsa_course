
public class painterPartitioningProblem {


    static boolean isValidAns(int arr[],int k,int mid){
        int boxes=0;
        int painterStartCount=1;

        for(int i=0;i<arr.length;i++){
            if(boxes+arr[i]<=mid){
                boxes+=arr[i];
            }
            else{
                // new painter
                painterStartCount++;
                boxes=arr[i];
            }

            if(painterStartCount>k || arr[i]>mid){
                return false;
            }
        }
        return true;
    }

    static int minTheMax(int arr[],int k){
        int n=arr.length;

        if(n<k){
            return -1;
        }

        int s=1;
        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int e=sum;
        int ans=-1;

        // let's main logic
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValidAns(arr,k,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        

        int arr[]={5,10,30,20,15};
        int k=3;

        int ans=minTheMax(arr, k);

        System.out.println(ans);

    }
    
}