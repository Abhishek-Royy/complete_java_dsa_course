
import java.util.ArrayList;
import java.util.List;

public class indexMarkingTechnique {

    static List <Integer> findDisappearNumber(int arr[]){
        int n=arr.length;
        for(int index=0;index<n;index++){
            int value=Math.abs(arr[index]);
            int position=value-1;

            // lets marking
            if(arr[position]>0){
                arr[position]=-arr[position];
            }
        }
        List <Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,4,4,5,2,2};
        List<Integer> ans = findDisappearNumber(arr);
        System.out.println(ans);

    }
}
