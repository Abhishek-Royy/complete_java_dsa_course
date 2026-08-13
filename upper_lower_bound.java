
public class upper_lower_bound {

    static int lowerBound(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = n;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target <= arr[mid]) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return ans;
    }

    static int upperBound(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
      
            if (arr[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 20, 20, 20, 30, 45, 55};
        int target = 20;

// -----------------------------------------------------------------------------------
        // let's calculate  NUMBER OF OCCURANCE IN SORTED OREDER(BINARY SEARCH)
        int lBound = lowerBound(arr, target);
        int uBound = upperBound(arr, target);

        int finalAnswer = uBound - lBound;
        System.out.println(finalAnswer);

    }
}
