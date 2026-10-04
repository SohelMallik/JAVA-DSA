
import java.util.Arrays;

public class _4Selection_Sort{
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        // Outer loop
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Inner loop: find the minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap only if needed
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

            System.out.println(
                "Pass " + (i + 1) + ": " + Arrays.toString(arr)
            );
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

