package com.StackParenthesis;
import java.util.Scanner;
import java.util.Stack;
public class StackBracket {
	private static boolean checkBracket(String input) {
		Stack<Character> stack = new Stack<>();
		char k;
		for(int i=0; i<input.length(); i++)
		{
			k=input.charAt(i);
			if(k=='['|| k=='{'||k=='(')
			{
				stack.push(k);
				continue;	
			}
			if(stack.isEmpty())
				return false;
			char z;
			switch(k)
			{
			case ']':
				z = stack.pop();
				if (z == '(' || z == '{')
					return false;
				break;
			case '}':
				z = stack.pop();
				if (z == '(' || z == '[')
					return false;
				break;
			case ')':
				z = stack.pop();
				if (z == '{' || z == '[')
					return false;
				break;       
			}
		}
		return(stack.isEmpty());
	}	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Sample input");
		String input = sc.next();
		boolean result = checkBracket(input);
		if(result)
		{
			System.out.println("The entered String has Balanced Brackets");
		}
		else
		{
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}
