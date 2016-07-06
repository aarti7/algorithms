
public class reverse_An_Integer {

	public static int Rev_int(int number_To_reverse)
	{ // Iterative
		int  t = number_To_reverse;
		int s = 0;
		int r = 0;
		while (t >0)
		{
			r = t % 10;
			s = s * 10 + r;
			t = t/10;
		}
		return s;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Rev_int(1234));
	}

}
