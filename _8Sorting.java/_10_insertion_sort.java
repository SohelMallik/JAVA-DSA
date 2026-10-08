public class _10_insertion_sort {
    public static void main(String [] args){
        int arr[] = {3,34,5,6,4,43,6,7};

        int n = arr.length;
        for(int i = 1; i < n; i++){
            int j = i;

            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
