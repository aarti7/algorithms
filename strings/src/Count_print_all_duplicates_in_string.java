/*still not optimized as repeated element should be printed only one time with its count!*/
import java.util.HashMap;
import java.util.Scanner;
public class Count_print_all_duplicates_in_string {
	//int size = 12;
	//String [] myarray = new String [size];
	
	public static void findthem(String theinputtedstring){
		String s = theinputtedstring;
		
		//System.out.println("Given string is = " + s );
		// for (String k: theinputtedstring)           // This wont work as java doesnt count over a string. It counts over an array / Hence you will need an array to take in the input to iterate over
				
		// myarray  = (String[]) theinputtedstring;    // Wrong : Can not cast from string to a string array

		// String strArray[] = s.split(" "); // Another way
	
		String [] array = new String [s.length()];
		for(int i = 0; i < s.length(); i++)
	    {		array[i] = String.valueOf(s.charAt(i)); 
	    		//System.out.println("The input string into array is " + array[i]);
	    }
		
		HashMap < String, Integer> M = new HashMap <String, Integer>();				// Any new string needs a new HashMap! // Hence, you create a new map everytime and hence it should be in a different method
		// Important! CANT USE PRIMITIVE IN any Template: like <char, int> is not valid
		
		
		for (int k = 0; k< array.length; k++)									// String length by .length(); // Array length by .length;
		{
			int t = 0;
			if (M.containsKey(array[k]))
			{	
				t= M.get(array[k]);
				t++;
				//System.out.println(t);
				M.put(array[k], t);
			}
			else
				{
				//System.out.println("put the element for the first time");
				M.put(array[k], 1);
				}
			if (t >1)
			{
				System.out.println("The element'" + array[k] +"' is repeated " + t + " times in the given string.");
			}
		}
	}
	
	public static void main(String[] args) {
		
		/*Scanner inputstring = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a string: ");
		String s = inputstring.toString();*/
		
		// HASHMAP WOT BE CREATED HERE!! As explained previously.
		//HashMap < Integer, Integer> M = new HashMap <Integer, Integer>();
		//findthem("java");
		//findthem("programming");
		findthem("kkkmnn");
		System.out.println("done!");

	}

}
