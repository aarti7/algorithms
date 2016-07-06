
public class substring {

	public static boolean isSubstring(String m, String s)
	{
		String mainstring= m;
		char [] mainstring_Array = mainstring.toCharArray();
		
		String subs = s;
		char [] subs_Array = subs.toCharArray();
		
		//(int i= 0, int j = 0; i < mainstring_Array.length, j < subs_Array.length; i++, j++)
		char first = subs_Array[0];
		
		for (int i = 0; i<mainstring_Array.length; i++)
		{
				if 	(mainstring_Array[i] == first)
				{	int k = i;
				    boolean var = true;
					for (int j = 0; j < subs_Array.length; j++,k++)
					{
						if (mainstring_Array[k] != subs_Array[j]){
							var = false;
						    break;
						}
					}
					if (var==true)
					    return true;	
				}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isSubstring("abcdbh", "bd"));
	}

}
