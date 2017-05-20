package recursive;
import recursive.TreeNode;

public class BTInorderTraversal {

	public static void printInorder(TreeNode root)
	{
		if(root==null) return;
		
		printInorder(root.left);
		System.out.println(root.data);
		printInorder(root.right);
		
	}
	public static void printPreOrder(TreeNode root)
	{
		if(root==null) return;
		
		System.out.println(root.data);
		printPreOrder(root.left);
		printPreOrder(root.right);
		
	}
	public static void printPostOrder(TreeNode root)
	{
		if(root==null) return;
		
		printPreOrder(root.left);
		printInorder(root.right);
		System.out.println(root.data);
		
	}
	
	public static  int size;
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
		
		// root2
		TreeNode root2 = new TreeNode(1);
		root2.right=new TreeNode(2);
		root2.right.left=new TreeNode(3);
		System.out.println("In order printing below");
		printInorder(root);
		System.out.println("pre order printing below");
		printPreOrder(root);
		System.out.println("post order printing below");
		printPostOrder(root);
		
	}
	
}
