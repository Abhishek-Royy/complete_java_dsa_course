
public class climbStairsProblem {

    static int climbingStairs(int n){
        // base case, jodi n==1 hoi
        if(n==1 || n==0){
            return 1;
        }
        // jodi n==2 hoi 
        if(n==2){
            return 2;
        }


        // nato finally recursive call
        int ans=climbingStairs(n-1)+climbingStairs(n-2);
        return ans;

    }

    public static void main(String[] args) {
        
        int ans=climbingStairs(3);
        System.out.println("Steps: "+ans);

    }
}