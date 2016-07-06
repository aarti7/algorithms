import java.util.HashMap;


public class tree_vertical_traversal_sol2_with_hashmap {
	
	public class Nnode{
		int datum;
		Nnode leftchild;
		Nnode rightchild;
		
		public Nnode(int n)
		{
			datum = n;
			leftchild = null;
			rightchild = null;
		}
	}
	
	public class axis_value{
		int rightmostaxis, leftmostaxis;
		
	}
	
	HashMap < Integer, Nnode[]> my_map ;
		
	public class binarytree{
		Nnode root;
		axis_value val= new axis_value();
	
		
		
	}
	
	public static void main(String[] args)
	{
		tree_vertical_traversal_sol2_with_hashmap ttt = new tree_vertical_traversal_sol2_with_hashmap(); // you oughta create an object 'ttt' of the program name
																			   // and then create objects through this 'ttt' object
		
		binarytree tree =  ttt. new binarytree();								// here! new object 'tree' is created through 'ttt'
		
		
																				// this is because all the other classes that you wana access, like 'binarytree' ' Nnode' are part of the program name class "tree_vesrtical_traversal_sol1"
																				// hence you need to create an object of program calss name first and then access the other classes.
																				// this need not be done in case class 'Nnode' and binarytree etc were not inside or a part of the program name class "tree_vesrtical_traversal_sol1".
		tree.root = ttt. new Nnode(1);
        tree.root.leftchild = ttt. new Nnode(2);
        tree.root.rightchild = ttt. new Nnode(3);
        tree.root.leftchild.leftchild =ttt. new Nnode(4);
        tree.root.leftchild.rightchild =ttt. new Nnode(5);
        tree.root.rightchild.leftchild = ttt.new Nnode(6);
        tree.root.rightchild.rightchild = ttt.new Nnode(7);
        tree.root.rightchild.leftchild.rightchild =ttt. new Nnode(8);
        tree.root.rightchild.rightchild.rightchild =ttt. new Nnode(9);
        
        System.out.println("vertical order traversal is :");
        tree.print_nodes(tree.root);  									// prints the vertical nodes for each axis via a loop that goes from leftmostaxis to rightmostaxis
        
	}


	
	
	
}
