import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;


public abstract class link {

	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(new File("/home/phani/Downloads/linked_jobs"));
		PrintWriter out = new PrintWriter("/home/phani/Downloads/linked_jobs_2");
		
		HashMap < String, Integer> hm = new HashMap  < String, Integer> ();
		
		//int counter = 0;
		while(scanner.hasNextLine()){
		//counter ++;
		//}
		/*for (int i = 0 ; i < counter; i++)
		{
			String s = scanner.nextLine();
			//char [] ch_array = s.toCharArray(); // You need n arrays for each row having one string!
		}*/
		//
		//for  (int i = 0 ; i < counter; i++)
		//{
			String s = scanner.nextLine();
			if (hm.containsKey(s))
			{//do nothing
				
			}
			else
			{
				hm.put(s, 1);
				out.println(s);
			}
		}	
		out.close();
		int ss= hm.size();
		System.out.println(ss);
	}

}
