package wordFrequency;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class CountFrequency
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the line : ");
		String para = new Scanner(System.in).nextLine();
		String[] words = para.split(" ");
		TreeMap< String , Integer > map = new TreeMap< String , Integer >();
		for(int i=0 ; i < words.length ; i++ )
		{
			if( map.get(words[i]) == null)
				map.put( words[i], 1);
			else
				map.put( words[i] , map.get( words[i] ) + 1 );
		}
		
		Comparator <String> compare = new Comparator<String> ()
		{
				public int compare(String first , String second ) 
				{
						if( map.get(first) > map.get(second) )
							return -1;
						else
							return 1;
				}
		};
		
		TreeMap < String , Integer > newmap = new TreeMap < String , Integer >(compare);
		newmap.putAll(map);
		for(String word : newmap.keySet())
		{
			System.out.println(word + "  =  " + map.get(word) );
		}
	}

}
