import java.util.Arrays;


public class graycode {

	public static boolean checkIfGray(String aa, String bb){
	
		String first=aa;
		String second=bb;
		
		char [] s_arr= second.toCharArray();
		
		char [] f_arr= first.toCharArray();
		int len = f_arr.length;		
		char [] ff1 = new char [len];
		char [] ff2 = new char [len];
		
		for( int i = 0; i < len ; i++){
			ff1[i] = f_arr[i];
			ff2[i] = f_arr[i];
		}
		
		
		boolean firstans = leftcheck(ff1, s_arr);
		/*System.out.print(ff); 
		System.out.println("meeee");
		System.out.print(s_arr);
		System.out.println("meeeeeeeeee");*/
		boolean secondans = rightcheck(ff2,s_arr);
		
		return firstans || secondans;
	}
	
	public static boolean leftcheck(char [] k, char [] s){

		char [] s_one = s;
		
		char [] f_one=k;
		int len = f_one.length;
		
		/*for(int i = 0; i<len; i++){ System.out.print(f_one[i]);}System.out.println("here1");
		for(int i = 0; i<len; i++){ System.out.print(s_one[i]);}
		System.out.println("here2");*/
		
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
		
		char [] f_two =kk; int len = f_two.length;
		
		/*for(int i = 0; i<len; i++){ System.out.print(f_two[i]);}System.out.println("here3");
		for(int i = 0; i<len; i++){ System.out.print(s_two[i]);}
		System.out.println("here4");
		*/
			
		
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
		System.out.println(checkIfGray(a,d));

	}

}
