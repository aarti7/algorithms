
public class height_of_tree {

	public static class Node {
		int data;
	    Node left, right;
	    Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	 
	public static class BinaryTree {
		Node root;	
		int height(Node Rooty){
			Node temp = Rooty;
			
			if (temp == null)
				return 0;
			else
			{
				int leftside = height(temp.left);
				int rightside = height(temp.right);
				return 1+ Math.max(leftside,rightside);
			}
			
		}
	}    
	
	public static void main(String[] args) {
	 		
		BinaryTree tree =new BinaryTree();
	    tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left =  new Node(4);
        tree.root.left.right = new Node(5); 
        
        System.out.println(tree.height(tree.root));
	}	

}
