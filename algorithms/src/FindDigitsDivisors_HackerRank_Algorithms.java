import java.io.*;
import java.util.*;

public class FindDigitsDivisors_HackerRank_Algorithms {
    
    public static int number_of_digits_diving_the_number_fully(int nn){
        int n = nn;
        int yes= 0;
        int no = 0;
		
        while(n>=1){
        	
        	int digit = n%10;
        	if (n%digit == 0){
        		yes ++;
        	}
        	else
        		no++;
        	n=n/10;
        	
        }
        return 0;
    }
    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 0; t <T; t++)
        {
            int N = in.nextInt();
            System.out.println(number_of_digits_diving_the_number_fully(N));
          
        
        }
    }
}
