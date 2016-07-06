
public class onearrayhavingthreestacks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

{
	
	int result = matrix1[0][i] * matrix2[j][n];
	System.out.println(result);

}





for( ; k< matrix1.length; k++)
	
{
	System.out.println("k" +k);
	for (;n<matrix2[0].length; n++)
	{
		System.out.println("n" +n);
		for ( ;  i< matrix1[0].length && j< matrix2.length; i++, j++)
		{
			System.out.println(i);
			System.out.println(j);
			result1[k][n] = result1[k][n] + matrix1[k][i] * matrix2[j][n];
//					result2 = result2 + matrix1[0][i] * matrix2[j][0];
		}
	}
}
System.out.println(result1[0][1]);
System.out.println(result1[1][1]);
System.out.println(result1[1][0]);
System.out.println(result1[0][0]);



/*
matrix1[0] of length = 4
matrix1[1] of length = 4
matrix1[2] of length = 4
				
matrix1[0]of length = 2
matrix1[1]of length = 2
matrix1[2]of length = 2
matrix1[3]of length = 2
*/