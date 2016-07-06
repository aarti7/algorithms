import java.util.HashMap;
import java.util.Map;


public class MajorityelementinArray_with_Hashmap {
	
	
	
	public static void main(String[] args) {
		int size = 12;
		int [] myarray = new int [size];
		
		myarray = new int[] {1,1,3,1,1,1,2,4,1,3,2,1};
		
		HashMap < Integer, Integer> mymap = new HashMap <Integer, Integer>();
		
		for (int i = 0; i< myarray.length; i++)
		{
			if (mymap.containsKey(myarray[i]))
			{
				int t = mymap.get(myarray[i]);
				t++;
				mymap.put(myarray[i], t);
				if (t > myarray.length/2)
					System.out.println("Majority element found" + myarray[i]);
				
			}
			else 
				mymap.put(myarray[i],1);
		}
						
	}

}
