
public class matrix_multiplication {
	int res;
	
	
	public static void main(String[] args) {
		int [][] matrix1 = new int [][]{new int[] {2,3},new int[] {5,1}};
		int [][] matrix2 = new int [][]{new int[] {4, 1},new int[] {7,1}};
		
		if (matrix1[0].length == matrix2.length)
		{
			
			int[][] result1 = new int [matrix1.length] [matrix2[0].length];	
			
			int i = 0;
			for (; i < result1.length; i++)
			{
				int j = 0;
				for ( ; j< result1[0].length; j++)
				{
					int k = 0 ;
					for ( ; k < matrix1[0].length; k++)
					{
						result1[i][j] = result1[i][j] + matrix1[i][k] * matrix2[k][j];
						
					}
					System.out.print(result1[i][j] + " ");
				}
				System.out.println();
			}
			
		}		
	}

}
