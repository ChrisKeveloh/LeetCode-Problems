package edu.ilstu;
import java.util.*;

public class isPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

	}
	
	public static boolean isPalindrome(String s)
	{
		Stack<Character> myStack = new Stack<>();
		String is = "";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		for(int i = 0; i<s.length(); i++)
		{
				myStack.push(s.charAt(i));
			
		}
		
		while(!myStack.isEmpty())
			is += myStack.pop();
		
		if(is.equalsIgnoreCase(s))
			return true;
		else
			return false;
		
		
	}

}
