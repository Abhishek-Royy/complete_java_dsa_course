public class peakIndex_MountainArray {

    static int mountainArrayPeakIndex(int arr[]){
        int n=arr.length;
        int s=0;
        int e=n-1;

        int ans=n;

        // kotokhon iteration cholbe
        while(s<=e){
            int mid=s+(e-s)/2;
            //jodi mid elem mid+1 er theke cheto hoi tarmane
            //ascending order a achi, left side a achi,
            //answer amara right side a pabo,
            if(arr[mid]<arr[mid+1]){
                //right a jbo
                s=mid+1;
            }
            else{
                //jodi mid elem mid+1 elem er the boro  hoi 
                //tarmane descending order a achi,right side  aachi,
                //right side a sob choto eleme,
                //mostly ei mid elem tau peakIndex hote pare , tai eta akta variable a store korbo.
                //r tarpor abar left check korbo
                ans=mid;

                e=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
        int arr[]={10,20,30,50,60,70,35,25};
        int ans=mountainArrayPeakIndex(arr);
        System.out.println("Peak element index is: "+ans);

    }
}
