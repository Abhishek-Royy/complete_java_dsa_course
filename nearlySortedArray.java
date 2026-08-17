public class nearlySortedArray {

    static int findTargetNearlySortedArray(int arr[], int target) {

        int n = arr.length;

        int s = 0;
        int e = n - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            // Check mid - 1
            if (mid - 1 >= 0 && arr[mid - 1] == target) {
                return mid - 1;
            }

            // Check mid
            if (arr[mid] == target) {
                return mid;
            }

            // Check mid + 1
            if (mid + 1 < n && arr[mid + 1] == target) {
                return mid + 1;
            }

            // Move right
            if (target>arr[mid]) {
                s = mid + 1;
            }

            // Move left
            else {
                e = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {3, 5, 10, 9, 11};
        int target = 10;

        int ans = findTargetNearlySortedArray(arr, target);

        System.out.print(ans);
    }
}