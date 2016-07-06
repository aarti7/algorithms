import java.util.HashMap;


public class dgsdd {
	public static void findthem(String theinputtedstring){
		String s = theinputtedstring;
		
		String [] array = new String [s.length()];
		for(int i = 0; i < s.length(); i++)
	    {		array[i] = String.valueOf(s.charAt(i)); 
	    }
		
		HashMap < String, Integer> M = new HashMap <String, Integer>();				
		
		for (int k = 0; k< array.length; k++)									
		{
			int t = 0;
			if (M.containsKey(array[k]))
			{	
				t= M.get(array[k]);
				t++;
				M.put(array[k], t);
			}
			else
				{
				
				M.put(array[k], 1);
				}
			if (t >1)
			{
				System.out.println("The element'" + array[k] +"' is repeated " + t + " times in the given string.");
			}
		}
	}
	
	public static void main(String[] args) {
		
		findthem("kkkmnn");
		System.out.println("done!");

	}

}
