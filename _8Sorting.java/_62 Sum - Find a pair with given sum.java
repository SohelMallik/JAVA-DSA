// 2 Sum - Find a pair with given sum
// Solved
// Difficulty: EasyAccuracy: 51.53%Submissions: 9K+Points: 2Average Time: 20m
// Given an array arr[] and an integer target, return the pair of elements whose sum equals target. An element cannot be used twice unless it appears multiple times in the array.

// Note:  If no pair exist, return an empty array.

// Examples:

// Input: arr[] = [2, 9, 10, 4, 15], target = 12
// Output: [2, 10]
// Explanation: Pair with sum equal to 12 is (2, 10).
// Input: arr[] = [3, 2, 4], target = 8
// Output: []
// Explanation: No pair exists with sum equal to 8.
// Input: arr[] = [1, 4, 5, 6, 1], target = 2
// Output: [1, 1]
// Explanation: Pair with sum equal to 2 is (1, 1).
// Constraints:
// 1 ≤ arr.size() ≤ 105
// 0 ≤ arr[i] ≤ 104
// 1 ≤ target ≤ 104

class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        Map <Integer, Integer> map = new HashMap<>();
        
        for(int i=0 ; i<arr.length; i++){
            
            int look= target- arr[i];
            
            if(map.containsKey(look)){
                
                return Arrays.asList(look, arr[i]);  // return the pair of elements whose sum equals target
                
            }
            
            map.put(arr[i],i);
            
        }
        return new ArrayList<>();
        
    }
}