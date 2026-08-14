
import java.util.ArrayList;
import java.util.List;

public class two_dimensionalArray {

    // sum of each row element
    /*static List <Integer> printSumOfRow(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;

        List <Integer> result=new ArrayList<>();
     
        for(int i=0;i<n;i++){
               int sum=0;       //it is mandotory
            for(int j=0;j<m;j++){
                int value=arr[i][j];
                sum=sum+value;
            }
            result.add(sum);
        }
        return result;

    }*/
    // ---------------------------------------------------
    // sum of each column element
    /*static List<Integer> sumOfColumn(int arr[][]) {
        List<Integer> result = new ArrayList<>();

        int n = arr.length;
        int m = arr[0].length;

        for (int col = 0; col < m; col++) {
            int sum = 0;
            for (int row = 0; row < n; row++) {
                sum = sum + arr[row][col];
            }

            result.add(sum);

        }
        return result;
    }*/
    // ----------------------------------------------
    // Wave print a matrix
    static List<Integer> printWave(int arr[][]) {
        List<Integer> ans = new ArrayList<>();

        int n = arr.length;       // rows
        int m = arr[0].length;    // columns

        for (int col = 0; col < m; col++) {

            if (col % 2 == 0) {
                // even column: bottom -> top
                for (int row = n - 1; row >= 0; row--) {
                    ans.add(arr[row][col]);
                }
            } else {
                // odd column: top -> bottom
                for (int row = 0; row < n; row++) {
                    ans.add(arr[row][col]);
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {

        int arr[][] = {{1, 2}, {5, 4}, {9, 6}};
        /*List<Integer>result=printSumOfRow(arr);
        System.out.println(result);    */

// -------------------------------------

        /*List<Integer> result=sumOfColumn(arr);
        System.out.println(result);*/
// -------------------------------------
        List<Integer> ans = printWave(arr);
        System.out.print(ans);

    }
}
