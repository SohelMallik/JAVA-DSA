/*Adding One to Array
Difficulty: EasyAccuracy: 41.59%Submissions: 111K+Points: 2Average Time: 10m
Given a non-negative integer(without leading zeroes) represented as an array arr. Your task is to add 1 to the number (increment the number by 1). The digits are stored such that the most significant digit is at the starting index of the array.

Examples:

Input: arr[] = [5, 6, 7, 8]
Output: [5, 6, 7, 9]
Explanation: 5678 + 1 = 5679
Input: arr[] = [9, 9, 9]
Output: [1, 0, 0, 0]
Explanation: 999 + 1 = 1000
Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 9
There are no leading zeros in the input number. */ 


class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        Vector<Integer> ans=new Vector<Integer>();// create ans
        int n= arr.length; 
        int carry=1; // initilization carry with 1
        for(int i=n-1; i>=0; i--){
            if(arr[i]+carry>=10){
                ans.add(0);
                carry=1;
                
            }else{
                ans.add(arr[i]+carry);
                carry=0;
            }
            
        }
        if(carry==1) ans.add(1);
        Collections.reverse(ans);
        return ans;
        
    }
}