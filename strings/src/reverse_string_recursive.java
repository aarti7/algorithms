
public class reverse_string_recursive {
// Recursive
	public static String R (String givenstring){
		String s = givenstring;
		if (s.isEmpty()) 
			return null;
		// Problem: Null case not handled well.
		if (s.length() ==1){
			return s;
			}
		else{			
		char prev = s.charAt(0);
		String subs = s.substring(1);
		String temp = R(subs); 
		String result = temp + prev ;		
		return result;}	
	}
		
	public static void main(String[] args) {
		//ring kk = R("");
		
		System.out.println(R("a"));
	}

}
