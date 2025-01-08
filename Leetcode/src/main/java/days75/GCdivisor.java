package days75;

public class GCdivisor {

	public static void main(String[] args) {
		String str1 = "leetleet";
		String str2 = "leetleetleetleetleet";
		System.out.println(gcdOfStrings(str1,str2));
		}
	
		    public  static String gcdOfStrings(String str1, String str2) {
		        if (!(str1 + str2).equals(str2 + str1)) {
		            return "";
		        }

		        int lenGCD = gcd(str1.length(), str2.length());
		        return str1.substring(0, lenGCD);     
		    }

		    private static int gcd(int i, int j) {
		        while (j != 0) {
		            int temp = i % j;
		            i = j;
		            j = temp;
		        }
		        return i;
		    }
		}
//		Set<Character> charSet = new HashSet<>();
//		for (String i = 0;  i< s2.length() ; i++) {
//			if( s1.contains(String.valueOf(s2.charAt(i))) ) {
//					charSet.add(s2.charAt(i));
//			}
//		}
//		String a = charSet.stream().map(String::valueOf).collect(Collectors.joining());
//		

	 
	
