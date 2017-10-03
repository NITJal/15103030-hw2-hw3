package countCharacters;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharacters 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the line: ");
		String str = new Scanner(System.in).next();
		LinkedHashMap<Character , Integer> map = new LinkedHashMap<Character , Integer>();
		for(int i=0 ; i < str.length() ; i++ )
		{
			if( map.get(str.charAt(i)) == null)
			{
				map.put( str.charAt(i), 1);
			}
			else
				map.put( str.charAt(i) , map.get(str.charAt(i))+1 );
		}
		for(Character ch : map.keySet() )
		{
			System.out.println(ch + " = " + map.get(ch) );
		}
	}

}
