
public class tree_vertical_traversal_sol1 {
	
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
	
	public class binarytree{
		Nnode root;
		axis_value val= new axis_value();
	
		
		void find_min_max(Nnode presentnode, axis_value l, axis_value r, int center_axis) 
		{
			if (presentnode == null)
				return;
			if (center_axis < l.leftmostaxis)
				l.leftmostaxis = center_axis;
			else if (center_axis > r.rightmostaxis)
				r.rightmostaxis = center_axis;
			
			find_min_max(presentnode.leftchild,l, r, center_axis -1 );
			find_min_max(presentnode.rightchild,l, r, center_axis + 1 );
		}
		
		void print_vertical_line (Nnode n, int prin_axis, int present_axis)
		{
			if(n == null)
				return;
			if (present_axis == prin_axis)
				{
				System.out.print(n.datum + " ");
				}
			
			
			print_vertical_line (n.leftchild, prin_axis, present_axis - 1);
			print_vertical_line (n.rightchild, prin_axis, present_axis + 1);
		}
		
		
		void vertical_order(Nnode node)
		{
			find_min_max(node, val, val, 0);
			
			//to print the  nodes for each axis//////////////////////////////////////////////////////////////////////// via a loop that goes from leftmostaxis to rightmostaxis
			for (int print_axis = val.leftmostaxis; print_axis < val.rightmostaxis; print_axis ++ )
			{
				print_vertical_line (node, print_axis, 0);
				System.out.println("");
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		tree_vertical_traversal_sol1 ttt = new tree_vertical_traversal_sol1(); // you oughta create an object 'ttt' of the program name
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
        tree.vertical_order(tree.root);  									// prints the vertical nodes for each axis via a loop that goes from leftmostaxis to rightmostaxis
        
	}

}
