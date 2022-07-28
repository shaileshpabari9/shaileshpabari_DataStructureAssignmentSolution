package ques1;

import java.util.Scanner;
import java.util.Stack;

public class processFloors {
	
	public static int totalnoFloors() {
		
		System.out.println("enter the total no of floors in the building");
		Scanner sc = new Scanner(System.in);
		int  input = sc.nextInt();
		return input;
	}
	
	public static int floorSizeOnGivenDay () {
		
		System.out.println("enter the floor size given on day");
		Scanner sc = new Scanner(System.in);
		int  input = sc.nextInt();
		return input;
	}
	
	public  int [] processFloors( int x, int remainingFloors, Stack<Integer> p , int t) 
	{
			int [] ans = new int [t+1];
			int i=0;
			ans[i]=x;
			while(!p.isEmpty() && p.peek()==(ans[i]-1) ) {
				ans[i+1]=p.peek();
				p.pop();
				i++;
			}
			return ans;
		}
	
	public static int convertStacktoArray(Stack<Integer> p, int input) {
		
		int i=0;
		Stack<Integer> s = new Stack<Integer>();
		while(!p.isEmpty() && input==p.peek()+1) {
		
			s.push(p.pop());
			input=input-1;
			i++;
		}
		
		while(!s.isEmpty()) {
			p.push(s.pop());
		}
		return i;
	}
	}
	
	
