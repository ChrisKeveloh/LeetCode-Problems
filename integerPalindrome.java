package edu.ilstu;
import java.util.*;


public class integerPalindrome {

	public static void main(String[] args) {
		
		System.out.println(intPalindrome(122));
	
	}
	
	public static boolean intPalindrome(int x)
	{
		
		
		
		String s = ""+x;
		String reversed = "";
		
		Stack<Character> myStack = new Stack<>();
	
		for(int i = 0; i < s.length(); i++)
		{
			myStack.push(s.charAt(i));
		}
		int size = myStack.size();
		for(int i = 0; i < size; i++)
		{
			reversed+=myStack.pop();
		}
		System.out.println(reversed);
		if(reversed.equalsIgnoreCase(s))
			return true;
	
		
		else
			return false;
		
		
		
		
		
	}

}
