// 852. Peak Index in a Mountain Array
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

// Return the index of the peak element.

// Your task is to solve it in O(log(n)) time complexity.

 

// Example 1:

// Input: arr = [0,1,0]

// Output: 1

// Example 2:

// Input: arr = [0,2,1,0]

// Output: 1

// Example 3:

// Input: arr = [0,10,5,2]

// Output: 1

 
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 1, h = arr.length-2;

        while(l <= h){
            int mid  = (l+h)/2;

            if(arr[mid] > arr[mid -1] && arr[mid] > arr[mid+1]) return mid;
            else if(arr[mid] > arr[mid -1] && arr[mid] < arr[mid+1]) l = mid+1;
            else h = mid -1;
        } 
        return -1;
    }
}

// FOR ARRAYLIST



public class Solution {
    public static int findPeakElement(ArrayList<Integer> arr) {
        int n = arr.size();

        // Edge case: single element
        if (n == 1) return n;

        // Check if the first or last element is a peak
        if (arr.get(0) > arr.get(1)) return 0;
        if (arr.get(n - 1) > arr.get(n - 2)) return n - 1;

        // Search space restricted to [1, n - 2] to prevent out-of-bounds on mid - 1 and mid + 1
        int l = 1;
        int h = n - 2;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            // Check if mid is the peak
            if (arr.get(mid) > arr.get(mid - 1) && arr.get(mid) > arr.get(mid + 1)) {
                return mid;
            }

            // On an upward slope: peak must lie on the right
            if (arr.get(mid) > arr.get(mid - 1) && arr.get(mid) < arr.get(mid + 1) ) {
                l = mid + 1;
            } 
            // On a downward slope or in a trough: peak must lie on the left
            else {
                h = mid - 1;
            }
        }

        return -1;
    }
}