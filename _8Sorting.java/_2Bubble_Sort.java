public class _2Bubble_Sort {

    public static void main(String[] args) {

        int arr[] = {5, 6, 4, 3, 2, 1};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swapping happened, array is already sorted
            if (!swapped) {
                break;
            }
        }

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}