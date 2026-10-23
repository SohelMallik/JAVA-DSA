// Kth Missing Positive in Sorted
// Solved
// Difficulty: MediumAccuracy: 53.02%Submissions: 61K+Points: 4
// Given a sorted array of distinct positive integers arr[] and a number k, You need to find the kth positive number that is missing from the arr[].

// Examples:

// Input: arr[] = [2, 3, 4, 7, 11], k = 5
// Output: 9
// Explanation: Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9.
// Input: arr[] = [1, 2, 3], k = 2
// Output: 5
// Explanation: Missing are 4, 5, 6… and 2nd missing number is 5.
// Input: arr[] = [3, 5, 9, 10, 11, 12], k = 2
// Output: 2
// Explanation: Missing are 1, 2, 4, 6… and 2nd missing number is 2.
// Constraints:

// 1 ≤ arr.size(), k ≤ 105
// 1 ≤ arr[i] ≤ 106

class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int l = 0, h = arr.length-1;
        while(l <= h){
            int mid = l +(h-l)/2;
            int missvalue = arr[mid] - (mid+1);
            
            if (missvalue < k) l = mid+1;
            else h = mid-1;
        }
        return h+1+k;
    }
}