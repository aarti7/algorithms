
public class checkAnagrams {

	public static boolean checkana(String aa, String bb){
		
		String first=aa;
		String second=bb;
		if (first.length() != second.length())
			return false;
		char k = second.charAt(0);
		char []  first_arr = first.toCharArray();
		
		for ( char c: first_arr){
			int t = second.indexOf(c);
			if (t!= -1)
				{
				second = second.substring(0,t) + second.substring(t+1);
				}
			else
				return false;
		}	
		return true;
			
	}
	public static void main(String[] args) {
		String a = "art";
		String b = "rat";
		System.out.println(checkana(a,b));

	}

}
