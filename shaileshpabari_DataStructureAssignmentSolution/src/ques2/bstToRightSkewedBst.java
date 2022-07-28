package ques2;

import java.util.Arrays;
import java.util.List;

public class bstToRightSkewedBst {
	
		
	public static Node node;
    static Node prevNode = null;
    static Node headNode = null;
			
			public static Node flattenBTToSkewed(Node root,
				            int order)
				{
				
						// Base Case
						if(root == null)
						{
							return null;
						}
						
						// Condition to check the order
						// in which the skewed tree to
						// maintained
						if(order > 0)
						{
						flattenBTToSkewed(root.right, order);
						}
						else
						{
						flattenBTToSkewed(root.left, order);
						}
						Node rightNode = root.right;
						Node leftNode = root.left;
						
						// Condition to check if the root Node
						// of the skewed tree is not defined
						if(headNode == null)
						{
						headNode = root;
						root.left = null;
						prevNode = root;
						}
						else
						{
						prevNode.right = root;
						root.left = null;
						prevNode = root;
						}
						
						// Similarly recurse for the left / right
						// subtree on the basis of the order required
						if (order > 0)
						{
						flattenBTToSkewed(leftNode, order);
						}
						else
						{
						flattenBTToSkewed(rightNode, order);
						}
						return headNode;
				}
							
			static void traverseRightSkewed(Node root)
		    {
		        if(root == null)
		        {
		            return;
		        }
		        System.out.print(root.data + " ");
		        traverseRightSkewed(root.right);       
		    }


}

