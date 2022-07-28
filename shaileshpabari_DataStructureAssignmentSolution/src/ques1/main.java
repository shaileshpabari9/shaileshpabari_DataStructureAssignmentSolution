package ques1;

import java.util.Arrays;
import java.util.Stack;

public class main {

	
	public static void main (String [] args){
			 
		processFloors bb = new processFloors();
	 
		var a =bb.totalnoFloors();
		Stack<Integer> s = new Stack<Integer>();
		int i=1;
		int t=0;
		int l=0;
		while(a!=0) {
		  var  b = bb.floorSizeOnGivenDay();
		  if(b!=a) {
			  sortedInsert(s, b);
			  System.out.println("Day"+ (a-(a-i)+l) +":");
			  i++;
		  }
		  else {
			 var d = bb.convertStacktoArray(s, a);
		   System.out.println(Arrays.toString(bb.processFloors(b, a, s,d)));
		   l++;
		   
		 a=a-d-1;
		  }
		}
  
}
	 // Recursive Method to insert an item x in sorted way
	 static void sortedInsert(Stack<Integer> s, int x)
	    {
	        // Base case: Either stack is empty or newly
	        // inserted item is greater than top (more than all
	        // existing)
	        if (s.isEmpty() || x > s.peek())
	        {
	            s.push(x);
	            return;
	        }
	 
	        // If top is greater, remove the top item and recur
	        int temp = s.pop();
	        sortedInsert(s, x);
	 
	        // Put back the top item removed earlier
	        s.push(temp);
	    }
	 
	    // Method to sort stack
	    static void sortStack(Stack<Integer> s)
	    {
	        // If stack is not empty
	        if (!s.isEmpty())
	        {
	            // Remove the top item
	            int x = s.pop();
	 
	            // Sort remaining stack
	            sortStack(s);
	 
	            // Push the top item back in sorted stack
	            sortedInsert(s, x);
	        }
	    }

	
	
	
	
}
