
import java.util.*;

public class _13_Quick_sort {

    static void quick(int[] arr, int st, int end) {
        if (st >= end) {
            return;
        }

        int pividx = partition(arr, st, end);

        quick(arr, st, pividx - 1);
        quick(arr, pividx + 1, end);
    }

    static int partition(int[] arr, int st, int end) {
        int idx = st - 1;
        int pivot = arr[end];

        for (int j = st; j < end; j++) {
            if (arr[j] <= pivot) {
                idx++;

                int temp = arr[j];
                arr[j] = arr[idx];
                arr[idx] = temp;
            }
        }

        idx++;

        int temp = arr[end];
        arr[end] = arr[idx];
        arr[idx] = temp;

        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3};

        quick(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
