// Single Among Doubles in a Sorted
// Solved
// Difficulty: MediumAccuracy: 55.54%Submissions: 121K+Points: 4
// Given a sorted array arr[]. Find the element that appears only once in the array. All other elements appear exactly twice. 

// Examples:

// Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65]
// Output: 4
// Explanation: 4 is the only element that appears exactly once.
// Input: arr[] = [5]
// Output: 5
// Input: arr[] = [1, 2, 2, 3, 3]
// Output: 1
// Constraints:
// 1 ≤ arr.size() ≤ 2 * 106
// 1 ≤ arr[i] ≤ 106

class Solution {
    int single(int[] arr) {
        // code here
        int n = arr.length;
        int l = 0, h = n-1;
        if(n==1) return arr[0];
        if(arr[0] != arr[0+1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        
        while(l <= h){
            int mid = l + (h-l)/2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]) return arr[mid];
            
            int f = mid , s = mid;
            
            if(arr[mid] == arr[mid-1]) f = mid -1;
            if(arr[mid] == arr[mid+1]) s = mid +1;
            
            int leftcount = f - l;
            int rightcount = h - s;
            
            if(leftcount %2 != 0) h = f -1;
            if(rightcount %2 != 0) l = s +1;
        }
        return 0;
    }
}