public class rotateMatrixClockWise {

    static void rotateMatrix90ClockWise(int arr[][]){
        int m=arr.length;    //row
        int n=arr[0].length;    //col

        // lets Transpose first
        for(int i=0;i<m;i++){
            for(int j=i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
      }

     
    //   lets reverse only each row element
      for(int row=0;row<m;row++){
         int startCol=0;
      int endCol=n-1;
        while(startCol<endCol){
            int temp=arr[row][startCol];
            arr[row][startCol]=arr[row][endCol];
            arr[row][endCol]=temp;
            startCol++;
            endCol--;
        }
      }


        }

    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {5, 4}};
        rotateMatrix90ClockWise(arr);

        // print the matrix
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
