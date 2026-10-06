// Merge two Unsorted Arrays
// Solved
// Difficulty: EasyAccuracy: 51.32%Submissions: 19K+Points: 2
// Given two different unsorted arrays a[ ] and b[ ], the task is to merge the two unsorted arrays and return a sorted array.

// Examples:

// Input: a[] = [10, 5, 15], b[] = [20, 3, 2]
// Output: [2, 3, 5, 10, 15, 20]
// Explanation: After merging both the array's and sorting it, we get the above output.  
// Input: a[] = [1, 10, 5, 15], b[] = [20, 0, 2]
// Output: [0, 1, 2, 5, 10, 15, 20]
// Explanation: After merging both the array's and sorting it, we get the above output.  
// Constraints:
// 1 ≤ a.size(), b.size()≤ 105
// -105 ≤ a[i], b[i]≤ 105


class Solution {
    public int[] sortedMerge(int[] a, int[] b) {
        
        int [] res = new int[a.length + b.length];
        
        int n= a.length;
        int m = b.length;
        
        int i = 0, j = 0 , k = 0;
        
        while(i < n ||  j < m){
            
            for (i = 0; i < n; i++){
                
                res[k++] = a[i];
            }
            
            
            for (j = 0; j <m; j++){
                
                res[k++] = b[j];
            }
        }
        
        Arrays.sort(res);
        
        return res;
        
    }
}



// for ArrayList

class Solution {
    public static ArrayList<Integer> mergeArrays(int[] a, int[] b) {

        ArrayList<Integer> res = new ArrayList<>();

        // Add elements of a
        for (int i = 0; i < a.length; i++) {
            res.add(a[i]);
        }

        // Add elements of b
        for (int i = 0; i < b.length; i++) {
            res.add(b[i]);
        }

        // Sort
        Collections.sort(res);

        return res;
    }
}