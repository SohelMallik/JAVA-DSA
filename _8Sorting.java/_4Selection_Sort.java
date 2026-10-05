import java.util.Arrays;

public class _4Selection_Sort {
    public static void main (String [] args){
        int [] arr = {5,6,4,3,2,1};
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int min = i;

            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            if (min != i){
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }

            System.out.println( 
                "Pass "+ (i+1) + ": " + Arrays.toString(arr)
            );

        }

        System.out.println("Sorted Arrays :" + Arrays.toString(arr));


    }
}