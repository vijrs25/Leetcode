package easy;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

	public static void main(String[] args) {
		
	 System.out.println(climbStairs(35));
	 int n = 35;
	  Map<Integer, Integer> memo = new HashMap<>();
      System.out.println(climbStairs2(n, memo));
		}
	  public static int climbStairs(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        return climbStairs(n-1) + climbStairs(n-2);
	    }
		    
		    private static int climbStairs2(int n, Map<Integer, Integer> memo) {
		        if (n == 0 || n == 1) {
		            return 1;
		        }
		        if (!memo.containsKey(n)) {
		            memo.put(n, climbStairs2(n-1, memo) + climbStairs2(n-2, memo));
		        }
		        return memo.get(n);
		    }
	  
	private static int fact(int number) {
		if (number == 1 || number == 0)
			return 1;
		else
			return number * fact(number - 1);
	}
	
	private static int permt(int diff, int i) {
		System.out.println(diff+" "+i+fact(diff+i));
		System.out.println(fact(diff)+fact(i) );
	return    (fact(diff+i)/(fact(diff)*fact(i)));
	}
}