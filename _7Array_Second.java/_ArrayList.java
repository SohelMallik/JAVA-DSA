import java.util.ArrayList;
public class  _ArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);// add element at the end of the list
        arr.add(2);

        arr.get(0);// get element at index 0
        arr.set(0,3);// set element at index 0 to 3
        arr.remove(0);// remove element at index 0
        arr.size();// get the size of the list
        arr.clear();// clear the list
        arr.isEmpty();// check if the list is empty
        arr.contains(3);// check if the list contains 3
        arr.indexOf(3);// get the index of 3
      System.out.println(arr);// print the list

    }
}