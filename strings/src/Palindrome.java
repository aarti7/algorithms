
public class Palindrome {
	public static boolean Palindromecheck (String word)
	{
		String s = word;
		int l = s.length();
		/*for (int i = 0; i<s.length()/2; i++)
		{
			if ( s.charAt(i)  ==  s.charAt(l-1))
				{
					
					return true;
				}
			l--;
		}
		return false;*/
		
		for (int i = 0; i<s.length()/2; i++)
		{
			if ( s.charAt(i) !=  s.charAt(l-1))
					{
				return false;
					}
			else
				l--;
			
		}
		return true;		
	}
	
	public static void main(String[] args) {
		
		System.out.println(Palindromecheck("popop"));
		
	}

}
