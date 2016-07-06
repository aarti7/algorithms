import java.util.Scanner;


public class unionfind {
	
	int [] id_arr;
	
	public unionfind(int n)
	{
		id_arr = new int[n];
		for(int i=0;i<n;i++)
		{
			id_arr[i] = i;
		}
		
	}
	
	
	public void dounion(int r, int t)
	{
		int k = id_arr[r];
		int l = id_arr[t];
		
		for (int j = 0 ; j < id_arr.length; j++)
		{
			if (id_arr[j] == l)
			{
				id_arr[j] = k;
			}
		}
		System.out.println();
	}
	
	
	public boolean isconnected( int r, int t)
	{
		if (id_arr[r] == id_arr[t])
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		unionfind u_f = new unionfind(N);
		System.out.println(N + " new objects create");
		System.out.println("Lets join some elements!");
		//int count = 0;
		while (input.hasNext())
		{
			int p = input.nextInt();
			int q = input.nextInt();
			if (! u_f.isconnected(p,q))
			{
				u_f.dounion(p,q);
				System.out.println(p+ " " +q);
			}
			
		System.out.println(input.nextInt() + " count: " /*+count*/);
		//count++;
			
		}
		System.out.println("program end!");
	}

}
