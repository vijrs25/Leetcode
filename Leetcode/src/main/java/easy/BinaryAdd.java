package easy;

//{}
public class BinaryAdd {
// how binary numbers are added
//0,1, 3, 111 = 7, 1111 = 15, 11111 = 31	
// binary to numbers -> binary
// numbers to binary -> binary
// add binary numbers and return characters
	
	public static void main(String[] args) throws InterruptedException {
		BigInteger st = System.currentTimeMillis();
		// Worked but not accepted.
		//System.out.println(addBinaryNum("1101", "0111"));
	    System.out.println(addBinary("1101","0111"));
	    
	    //Testing
	    //Thread.sleep(10);
	    
	    BigInteger et = System.currentTimeMillis();
	    System.out.println((et-st));
	}
	  static String addBinaryNum(String a, String b){
		  return num2Bin(bin2Num(a)+bin2Num(b));
	  }
	  static BigInteger bin2Num(String bin){
		 BigInteger unressolved = Integer.parseInt(bin);
		 BigInteger resolved=0;
		 BigInteger count=0;
		 while(unressolved>0){
			resolved = (BigInteger) (resolved+((unressolved%2)*Math.pow(2, count))); 
			count++;
			unressolved= unressolved/10;
		 }
		 return resolved;
	}
	  static String num2Bin(BigInteger num){
		 String i="";
		  while(num>1){
			  i=i+num%2;
			  System.out.println(i);
			  num=num/2;
		  }
		  i=i+num;
		  return new StringBuffer(i).reverse().toString();
	  }
	  
	 //Fastest Method 
	  static String addBinary(String a, String b){
	  
	  StringBuilder sb = new StringBuilder();	  
	  BigInteger carry =0 ;
	  BigInteger i = a.length()-1;
	  BigInteger j = b.length()-1;
	  while(i>=0|| j>=0 || carry==1){
		if(i>=0){
			carry += a.charAt(i--)-'0';
		}  
		if(j>=0){
			carry += b.charAt(j--)-'0';
		}
	  System.out.println("carry "+carry +" remainder "+carry%2);	
	  sb.append(carry%2);
	  carry/=2;
	  }
	  return sb.reverse().toString();
	  }
	  
	  
}
