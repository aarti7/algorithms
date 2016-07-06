
public class reverse_string_Iterative {
//Iterative Method
	
	public static char[] Rev (String s)
	{
	String givenstring = s;
	char k ;	
	char [] Arr = givenstring.toCharArray();
	int l = Arr.length;
	
	for (int i = 0; i < Arr.length/2; i++)
		{
			k = Arr[i];
			Arr[i] = Arr[l -1];
			Arr[l -1] = k;
			l--;
		}
	//System.out.println(Arr);
	return Arr;
	}
	public static void main(String[] args) {
		//char [] kk;
		// char [] kk = new []; WHY WRONG??!!
		char [] kk = Rev("a    ");
		//System.out.println("done");
		System.out.println(kk);
	}

}
