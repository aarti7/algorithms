
public class isUnique {

	public static boolean check( String s)
	{
		boolean[] x = new boolean [256]; // create a boolean array with all false (the default value) 
		for (int t = 0; t < s.length(); t++)
		{
			int valueATt = s.charAt(t); 
			System.out.println(valueATt);  //  character at t in string s will be saved as the ASCII value of that character!!!!
			if (x[valueATt])            // For that ASCII value in empty array, see if its already visited , ie it will be true
				{
				return false;
				}
			x[valueATt] = true;
		}
		return true;
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			boolean a = check("abc");
			System.out.println("return value is : " +a);
	}

}
