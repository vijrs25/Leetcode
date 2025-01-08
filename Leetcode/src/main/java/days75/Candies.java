package days75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*use of int greatest(int[] candies){
	int result=Integer.MIN_VALUE;
	for(int i=0 ;i<candies.length;i++){
    	result=Integer.max(result, candies[i]);
}
  instead of Stream, It will make it slow 
return result;
*/

public class Candies {

	public static void main(String[] args) {
		int candies[] =   {4,2,1,1,2};
		int extra = 1;
		
		List<Boolean> bool = kidsCandies(candies, extra);
		System.out.println(bool);

	}
	  public static List<Boolean> kidsCandies(int [] can, int extra)  { 
		   List<Boolean> list = new ArrayList<>() ;
		   int i=0;
		   int arrmax = Arrays.stream(can).max().orElse(0);
				   
		   while(i<can.length)  { 
			   if((can[i]+extra-arrmax) >= 0)  { 
				   list.add(i,true);
			   }
			   else
				   list.add(i, false);
			   i++;
		   }
		   return list;
	  }
}
