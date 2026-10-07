// Union of 2 Sorted Arrays
// Solved
// Difficulty: MediumAccuracy: 31.39%Submissions: 578K+Points: 4Average Time: 20m
// Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order. Union of two arrays can be defined as the set containing distinct elements that are present in either of the arrays.

// Examples:

// Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
// Output: [1, 2, 3, 4, 5, 6, 7]
// Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
// Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
// Output: [1, 2, 3, 4, 5]
// Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
// Input: a[] = [1, 1, 1, 1, 1], b[] = [2, 2, 2, 2, 2]
// Output: [1, 2]
// Explanation: Distinct elements including both the arrays are: 1 2.
// Constraints:

// 1 ≤ a.size(), b.size() ≤ 105
// -109 ≤ a[i], b[i] ≤ 109

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        ArrayList<Integer> res = new ArrayList<>();

        int i = 0, j = 0;
        int n = a.length;
        int m = b.length;

        while (i < n && j < m) {

            if (a[i] == b[j]) {

                if (res.isEmpty() || res.get(res.size() - 1) != a[i]) {
                    res.add(a[i]);
                }

                i++;
                j++;

            } else if (a[i] < b[j]) {

                if (res.isEmpty() || res.get(res.size() - 1) != a[i]) {
                    res.add(a[i]);
                }

                i++;

            } else {

                if (res.isEmpty() || res.get(res.size() - 1) != b[j]) {
                    res.add(b[j]);
                }

                j++;
            }
        }

        while (i < n) {

            if (res.isEmpty() || res.get(res.size() - 1) != a[i]) {
                res.add(a[i]);
            }

            i++;
        }

        while (j < m) {

            if (res.isEmpty() || res.get(j-1)!= b[j]) {
                res.add(b[j]);
            }

            j++;
        }

        return res;
    }
}



// for Array




// FOR UNSORTED ARRAY 



class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        
        int i = 0, j = 0;
        int n = a.length;
        int m = b.length;

        while (i < n && j < m) {

            if (a[i] == b[j]) {

                if (res.isEmpty() || res.get(res.size() - 1) != a[i]) {
                    res.add(a[i]);
                }

                i++;
                j++;

            } else if (a[i] < b[j]) {

                if (res.isEmpty() || res.get(res.size() - 1) != a[i]) {
                    res.add(a[i]);
                }

                i++;

            } else {

                if (res.isEmpty() || res.get(res.size() - 1) != b[j]) {
                    res.add(b[j]);
                }

                j++;
            }
        }

        while (i < n) {

            if (res.isEmpty() || res.get(res.size() - 1) != a[i]) {
                res.add(a[i]);
            }

            i++;
        }

        while (j < m) {

            // ✅ Corrected
            if (res.isEmpty() || res.get(res.size() - 1) != b[j]) {
                res.add(b[j]);
            }

            j++;
        }

        return res;
    }
}