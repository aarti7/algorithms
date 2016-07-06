
public class IntegerStringtoInt_better {
		
	public static int sTOi(String givenstring){
		String s = givenstring;
		int sum = 0;
		int h;
		for (int k = 0; k < s.length(); k++)
		{	
			h = s.charAt(k) - '0';
			//System.out.println(s.indexOf("3"));
			
			sum = sum *10 +h;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sTOi("1234"));
	}

}
