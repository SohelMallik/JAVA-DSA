
import java.util.* ;
import java.io.*; 
public class Solution {
   
   	public static boolean isStrobogrammatic(String n){
    	Map <Character, Character> map = new HashMap<>();
		map.put('0','0');
		map.put('1','1');
		map.put('6','9');
		map.put('8','8');
		map.put('9','6');

		int i = 0;
		int j = n.length()-1;

		while(i<=j){
			char l = n.charAt(i);
			char r = n.charAt(j);

			if(map.containsKey(l)){
				if(map.get(l) != r){
					return false;
				}else{
					i++;
					j--;
				}
			}else{
				return false;
			}
		}
		return true;
	   
    }

}