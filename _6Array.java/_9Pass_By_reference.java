 \\ PASSING BY VALUE
 public class _9Pass_By_reference {

    static void changeValue(int x) {
        x = 100;
        System.out.println("Inside method: " + x);
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Inside method: " + x);
        changeValue(x);

        System.out.println("Outside method: " + x);
    }
}


\\ PASSING BY REFERENCE

// public class _9Pass_By_reference {
//     public static void change(int [] arr){
//         arr[1]=45;
//     }
//     public static void main(String [] args){
//         int [] x={10,20,340};
//         System.out.println("Before change: "+x[1]); \\ Output will be 20
//         change(x);
//         System.out.println("After change: "+x[1]);  \\ Output will be 45
//     }
    
// }
