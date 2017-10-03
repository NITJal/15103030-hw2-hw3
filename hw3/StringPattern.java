package pattern;

import java.util.Scanner;

public class StringPattern 
{
	public static void main(String[] args)
	{
		System.out.print("Enter the String: ");
		String str = new Scanner(System.in).next();
		String temp = "";
		for(int i=0 ; i < str.length() ; i++ )
		{
			temp += str.charAt(i);
			System.out.println( str.substring( i+1, str.length()) + temp );
		}
	}
}
