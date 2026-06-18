
public class _12_searchint {
    public static void main(String [] args){
        int [] arr={10,20,30,40,50};
        int target=30;
        boolean flag=false;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                flag=true;
                break;
            }
        }

        if(flag){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
    }
}



