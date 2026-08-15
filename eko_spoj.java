// Maximum Possible height calculate


public class eko_spoj {

    static boolean isValidAns(int trees[],int m,int mid){
        int woodCollect=0;
     

        for(int i=0;i<trees.length;i++){
            // jodi currrent tree ta boro hoi max(mid) value theke , tahole [tree-mid] korle 
            // baki Wood colunt ta pabo cureent tree er 
            if(trees[i]>mid){
                int curreWoodCount=trees[i]-mid;
                // eta k ebar total woodCollect er sathe add kore debo
                woodCollect+=curreWoodCount;
            }
        }

        if(woodCollect>=m){
            return true;
        }
        else{
            return false;
        }

    }


    static int maximumCuttingHeight(int trees[],int m){
        int n=trees.length;
        int s=0;
        int max=-1;

        for(int i=0;i<n;i++){
            if(trees[i]>max){
                max=trees[i];
            }           
        }
        int e=max;
        int ans=-1;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(isValidAns(trees, m, mid)){
                
                // potentialAnswer store in a variable
                ans=mid;
                // go right side
                s=mid+1;
            }
            else{
                // go left side only
                e=mid-1;
            }
        }

        return ans;


    }

    public static void main(String[] args) {
        
        int trees[]={20,15,10,17};
        int m=7;
        int ans=maximumCuttingHeight(trees, m);

        System.out.println(ans);


    }
}
