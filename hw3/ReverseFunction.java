package reverseWord;

import java.util.Scanner;

public class ReverseFunction 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the line : ");
		String line = new Scanner(System.in).nextLine();
		String[] words = line.split(" ");
		int j;
		String temp = "";
		System.out.println();
		System.out.println("Reversed String : ");
		for(String word : words)
		{
			j = word.length()-1;
			if(word.charAt(j)=='.')
				j--;
			while(j>=0)
			{
				 System.out.print(word.charAt(j--));
			}
			System.out.print(" ");
		}
		System.out.print(".");
	}

}
