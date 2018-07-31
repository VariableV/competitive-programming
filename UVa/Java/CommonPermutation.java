import java.util.*;
import java.io.*;

public class CommonPermutation
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		while(key.hasNextLine())
		{
			int[] histo = new int[26], histt = new int[26];
			String string0 = key.nextLine(), string1 = key.nextLine();
			for(char c : string0.toCharArray())
				histo[c-97]++;
			for(char c : string1.toCharArray())
				histt[c-97]++;
			for(int i=0; i<26; i++)
			{
				int prnt = Math.min(histo[i], histt[i]);
				for(int c = 0; c < prnt; c++)
					System.out.print((char)(97+i));
			}
			System.out.println();
		}
	}
}