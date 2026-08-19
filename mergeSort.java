import java.util.Arrays;

public class mergeSort {

    // Merge two sorted parts
    static void merge(int arr[], int s, int mid, int e) {

        int temp[] = new int[e - s + 1];

        int i = s;      // left part
        int j = mid + 1;    // right part
        int k = 0;

        // Compare elements from both parts
        while (i <= mid && j <= e) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Remaining elements of left part
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Remaining elements of right part
        while (j <= e) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy temp back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[s + x] = temp[x];
        }
    }


    // Merge Sort
    static void mergeSort(int arr[], int s, int e) {

        // Base case
        if (s >= e) {
            return;
        }

        int mid = s + (e - s) / 2;

        // Sort left half
        mergeSort(arr, s, mid);

        // Sort right half
        mergeSort(arr, mid + 1, e);

        // Merge both sorted halves
        merge(arr, s, mid, e);
    }


    public static void main(String[] args) {

        int arr[] = {5, 2, 8, 1, 3, 7, 4};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
    }
}