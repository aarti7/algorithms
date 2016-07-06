import java.util.Arrays;


public class graycode_better {

	public static boolean checkIfGray(String aa, String bb){
	
		String first=aa;
		String second=bb;
		
		char [] s_arr= second.toCharArray();
		char [] f_arr= first.toCharArray();
		
		boolean firstans = leftcheck(f_arr, s_arr);
		boolean secondans = rightcheck(f_arr,s_arr);
		
		return firstans || secondans;
	}
	
	public static boolean leftcheck(char [] k, char [] s){

		char [] s_one = s;
		
		char [] f_one=k.clone();
		int len = f_one.length;
		
		int placeholder = 0;
		for( int i = len-1 ; i>=0; i--)
		{	if (f_one[i] == '1')
			{placeholder = i;
			break;
			}
			else
			{}
			
		}
	
		if (f_one[placeholder-1] == '1')
			f_one[placeholder-1] = '0';
		else
			f_one[placeholder-1] = '1';
		
		//check left
		if (Arrays.equals(f_one, s_one))
			return true;
		else
			return false;
	}
	
	public static boolean rightcheck(char [] kk, char [] ss){
		char [] s_two = ss;
		
		char [] f_two =kk.clone(); 
		
		int len = f_two.length;
		
		if (f_two[len-1] == '1')
			f_two[len-1] = '0';
			else
				f_two[len-1] = '1';
			//check right 
			if (Arrays.equals(f_two, s_two))
				
				return true;
			else
				return false;
			
	}
	
	public static void main(String[] args) {
		String a = "101000";
		String b = "101001";
		String c = "111000";
		String d = "101010";
		System.out.println(checkIfGray(a,c));

	}

}
