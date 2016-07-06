
public class IntegerStringtoInt {

	public static void sTOi(String givenstring){
		String s = givenstring;
		int Arrsize = 10; //NOT NEEDED AS Will be shown in the better code
		int [] Arr =  new int [Arrsize];	// NOT NEEDED AS Will be shown in the better code
		int[] Arr1 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57}; //  NOT NEEDED AS Will be shown in the better code
		
		for (int k = 0; k < s.length(); k++)
		{
			// Noob Code
			for (int i = 0; i <Arr1.length ; i++)
			{
				if (s.charAt(k) == Arr1[i]){
						Arr[k] = i;
				}
			}
			System.out.println(Arr[k]);
			
		}
	}
	
	public static void main(String[] args) {
		sTOi("1234");
		
	}

}
