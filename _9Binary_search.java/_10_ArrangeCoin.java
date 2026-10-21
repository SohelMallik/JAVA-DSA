
// Code
// Testcase
// Testcase
// Test Result
// 441. Arranging Coins
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

// Given the integer n, return the number of complete rows of the staircase you will build.

 

// Example 1:


// Input: n = 5
// Output: 2
// Explanation: Because the 3rd row is incomplete, we return 2.
// Example 2:


// Input: n = 8
// Output: 3
// Explanation: Because the 4th row is incomplete, we return 3.
 

// Constraints:

// 1 <= n <= 231 - 1

class Solution {
    public static int sqrt(long n){
        long l = 1, h = n;

        while(l <= h){
            long mid = l +(h-l)/2;
            if(mid == n/mid) return (int)mid;
            if(mid < n/mid) l = mid +1;
            else h = mid -1;
        }
        return (int)h;
    }
    public int arrangeCoins(int n) {
        long m = n;
        return (int) ((sqrt(8*m+1)-1)/2);
    }
}