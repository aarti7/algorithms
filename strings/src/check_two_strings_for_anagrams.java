import java.util.Arrays;
public class check_two_strings_for_anagrams {

	public static boolean isanagram(String s, String d){
		String first =s;
		String second = d;
		
		char [] firstchararray = first.toCharArray();		// Need to change it to an array!
		//char [] anagramarray = second.toCharArray(); // No need to make an array 'anagramarray' of second for the method 2!
		if (firstchararray.length !=second.length()) // 'second' was anagramarray for method 1 // Also, to get length of array, write array.length; //to get length of string, write string.length(); //
		{ 
			return false;
		}
// Method 2
		for (char f: firstchararray){
			int index = second.indexOf(f);
			if (index != -1)
			{
				second = second.substring(0,index) + second.substring(index+1, second.length());
			}
			else
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String a = "may";
		String b = "amy";
		System.out.println(isanagram(a,b));
	}
}
