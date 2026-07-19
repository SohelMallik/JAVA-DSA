public class _6Find_Duplicate {

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1};

    public static void main(String[] args) {
        _6Find_Duplicate obj = new _6Find_Duplicate();
        obj.findDuplicate();
    }

    public void findDuplicate() {
        boolean found = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element is: " + arr[i]);
                    found = true;
                    return; // Remove this line if you want to print all duplicates
                }
            }
        }

        if (!found) {
            System.out.println("No duplicate element found.");
        }
    }
}
