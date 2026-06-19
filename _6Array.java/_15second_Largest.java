
public class _15second_Largest {

    public static void main(String[] args) {

        int[] arr = {12, 34, 45, 45, 3, 4, 5, 34};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                smax = max;
                max = num;
            } else if (num > smax && num != max) {
                smax = num;
            }
        }

        System.out.println("Largest = " + max);
        System.out.println("Second Largest = " + smax);
    }
}

 //ANOTHER APPROACH

// public class _15second_Largest {
//     public static void main(String[] args) {
//         int [] arr={12,34,45,45,3,4,5,34};
//         int max=Integer.MIN_VALUE;
//         int smax=Integer.MIN_VALUE;

//         for(int i=0; i<arr.length-1; i++){
//             if(arr[i]>max) max=arr[i];
//         }
    
//         for(int i=0; i<arr.length-1; i++){
//             if(arr[i]>smax && arr[i]!= max) smax=arr[i];
//         }

//         System.out.println(max);
//         System.out.println(smax);
    
// }
// }

