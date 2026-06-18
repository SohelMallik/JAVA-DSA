public class _13SearchMultipleElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int[] targets = {20, 35, 50, 60};

        for (int target : targets) {
            boolean found = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(target + " found");
            } else {
                System.out.println(target + " not found");
            }
        }
    }
}
    
// The outer loop is:

// for (int target : targets)

// This loop takes one element at a time from the targets array and stores it in the variable target.

// Targets Array
// int[] targets = {20, 35, 50, 60};
// 1st Iteration
// target = 20

// Now the inner loop searches for 20 in:

// {10, 20, 30, 40, 50}

// Result:

// 20 found
// 2nd Iteration
// target = 35

// Now the inner loop searches for 35 in:

// {10, 20, 30, 40, 50}

// Result:

// 35 not found
// 3rd Iteration
// target = 50

// Now the inner loop searches for 50.

// Result:

// 50 found
// 4th Iteration
// target = 60

// Now the inner loop searches for 60.

// Result:

// 60 not found
// Visualization
// targets = {20, 35, 50, 60}

// Outer Loop
//     ↓
// target = 20
//     ↓
// Inner Loop searches 20 in arr

// target = 35
//     ↓
// Inner Loop searches 35 in arr

// target = 50
//     ↓
// Inner Loop searches 50 in arr

// target = 60
//     ↓
// Inner Loop searches 60 in arr