// Kth Smallest
// Difficulty: MediumAccuracy: 35.17%Submissions: 851K+Points: 4Average Time: 25m
// Given an integer array arr[] and an integer k, find and return the kth smallest element in the given array.

// Examples :

// Input: arr[] = [10, 5, 4, 3, 48, 6, 2, 33, 53, 10], k = 4
// Output: 5
// Explanation: 4th smallest element in the given array is 5.
// Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
// Output: 7
// Explanation: 3rd smallest element in the given array is 7.
// Constraints:

// 1 ≤ arr.size(), arr[i] ≤ 105
// 1 ≤ k ≤ arr.size()


class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        int n =  arr.length;
        
        for(int i = 0; i<= k-1; i++){
            int mini = i;
            
            for( int j = i +1; j < n; j++){
                
                if (arr[j] < arr[mini]){
                    mini = j;
                }
            }
            
            if( mini != i){
                int temp = arr[i];
                arr[i] = arr[mini];
                arr[mini] = temp;
             }
             
        }
        
        return arr[k-1];
    }
}


