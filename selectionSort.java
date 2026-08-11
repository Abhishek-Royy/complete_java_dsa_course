
public class selectionSort {

    static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }

    public static void main(String[] args) {

        int arr[] = {4, 3, 5, 8, 1, 6};
        selectionSort(arr);

        for (int elem : arr) {
            System.out.print(elem + " ");
        }

    }
}
