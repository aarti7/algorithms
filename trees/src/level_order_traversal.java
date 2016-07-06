import java.util.LinkedList;
import java.util.Queue;

public class level_order_traversal {
	
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
		
		
		
		public void traversethelevel(Node node){
			Node temp = node;
			
			Queue <Node> q = new LinkedList<Node>();
			if (temp== null)
				pass;
			else
			{
			q.add(temp.left);
			q.add(temp.right);
			}
			traversethelevel(temp.left);
			traversethelevel(temp.right);
		}
	
	
	}
	public static void main(String[] args) {
		BinaryTree tree =new BinaryTree();
	    tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left =  new Node(4);
        tree.root.left.right = new Node(5);

	}

}
