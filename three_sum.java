import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * three_sum
 */
public class three_sum {
    static List<List<Integer>> threeSum(int arr[]){
          Set<List<Integer>> output = new HashSet<>();
        int target=0;

        int n=arr.length;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        List <Integer> ans=new ArrayList<>();
                        ans.add(arr[i]);
                        ans.add(arr[j]);
                        ans.add(arr[k]);
                        
                        output.add(ans);
                    }
                }
            }
        }
        return new ArrayList<>(output);
    }
    public static void main(String[] args) {
         int arr[] = {1, 2, -2, -1, 2, 1, 1};
        List<List<Integer>> ans = threeSum(arr);

        for(List<Integer>elem:ans){
            System.out.print(elem);
        }

    }
}