public class searchElem2DArray {

    static boolean searchElem2dArrayBruteForce(int arr[][],int target){
        int totalRow=arr.length;
        int totalCol=arr[0].length;

        // from where iteration start
        int row=0;
        int col=totalCol-1;


        while(row<totalRow && col>=0){
            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=5;
        searchElem2dArrayBruteForce(arr, target);
    }
}
