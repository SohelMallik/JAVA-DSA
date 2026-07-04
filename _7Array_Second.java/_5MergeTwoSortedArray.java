public class _5MergeTwoSortedArray {

    public static void merge(int[] a, int[] b, int[] c, int n, int m) {
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < n) {
            c[k++] = a[i++];
        }

        while (j < m) {
            c[k++] = b[j++];
        }
    }

    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};

        int n = a.length;
        int m = b.length;

        int[] c = new int[n + m];

        merge(a, b, c, n, m);

        System.out.println("Merged Array:");

        for (int num : c) {
            System.out.print(num + " ");
        }
    }
}