package days75;

public class MergeString_1 {

	public static void main(String[] args) {
		String a = "police";
		String b = "xAWZDJSAOLSDAJQWERQWEASDF";
		int i = 0;
		StringBuilder c = new StringBuilder();
		i=0;
		while(i < (a.length() +b.length()) )  { 
			if(b.length()>i) 
				c.append(b.charAt(i));
			if(a.length()>i) 
				c.append(a.charAt(i)); 	
			i++;
		}
		    System.out.println(c);
	}

}
