package ques2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

	public static void main (String [] args) {
		
	Node root = new Node(50);
	root.left = new Node(30);
	root.right = new Node(60);
	root.left.left = new Node(10);
	root.right.left= new Node(55);
	
	bstToRightSkewedBst bb = new bstToRightSkewedBst();
	
	
	var a= bb.flattenBTToSkewed(root, 0);
	bb.traverseRightSkewed(a);
	}
	
}
