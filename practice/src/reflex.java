
import java.io.*;
	import java.util.*;

	public class reflex {
	    public static int func1(String one, String two){
	        String a = one;
	        String b = two;
	       
	        int size = b.length();
	        
	        char [] a_array = a.toCharArray();
	        char [] b_array = b.toCharArray();
	        
	       // a_array = a.toCharArray();
	       // b_array = b.toCharArray();
	        
	        int t_size = 2 * size;
	        
	        char [] t_array = new char [t_size];
	         
	        for(int i =0, j= 0; j <size; i++ , j++){
	            t_array[i] = b_array[j];
	            t_array[i + size] = b_array[j];
	            
	        }
	       /*or (int i = 0; i< t_size; i++){
	            System.out.print(t_array[i]);
	        }
	        */
	        
	        char firstchar = a_array[0];
	        
	        for (int k =0; k< t_size ;k++ )
	        {
	            if (t_array[k] == firstchar)
	            {
	              //starting point
	              boolean flag = true;
	              for (int p =1; p<size ;p++ )
	              {
	                  if (t_array[p+k] != a_array[p])
	                  {
	                      flag = false;
	                      break;
	                  }
	              }
	              if (flag==true)
	                  return 1;
	             }
	            else{}           
	        }
	       return 0;
	      }
	        
	        
	    
	    public static void main(String[] args) {
	        //Scanner in =  new Scanner(System.in);
	        String aa = "dream";//in.nextLine();
	        String bb = "mdrea";//in.nextLine();
	        int result = func1(aa,bb);
	        System.out.println(result);
	    }
	}
	
	
	
	
	
	
	

