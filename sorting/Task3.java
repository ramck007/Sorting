package sorting;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;



public class Task3 {

	public TreeNode insertTree(TreeNode root) { //[2,1,3]
		if(root == null) {
			return null;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root); //2
		 
		
		while(!queue.isEmpty()) {
			TreeNode currentNode = queue.poll();
			//swap children
		/*	TreeNode temp = currentNode.left;
			currentNode.left=currentNode.right;
			currentNode.right=temp;
			
			if(currentNode.left!=null) {
				queue.add(currentNode.left);
			}
			
			if(currentNode.right!=null) {
				queue.add(currentNode.right);
			}*/
			
		}
		
		return root;
		
	}
	
	
	public static void main(String[] args) {
		TreeNode t;
		/*	Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
*/
		
	}

}
/*
Given a binary tree, write a program to invert the binary tree and return it

Example:
Input:
 5
/   \
2     8
/ \   / \
1   4 6   9
Output:
 5
/   \
8     2
/ \   / \
9   6 4   1*/