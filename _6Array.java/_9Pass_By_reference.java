public class _9Pass_By_reference {
    public static void change(int [] arr){//
        arr[1]=45;
    }
    public static void main(String [] args){
        int [] x={10,20,340};
        System.out.println("Before change: "+x[1]);
        change(x);// Function Call
        System.out.println("After change: "+x[1]);
    }
    
}
