import java.util.*;

public class WhatIsTheCard
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int n = key.nextInt();
		key.nextLine();
		for(int t = 1; t <= n; t++)
		{
			Stack<String> deck = new Stack<>();
			for(int i = 0; i<52; i++)
				deck.push(key.next());
			ArrayList<String> temp = new ArrayList<>();
			for(int i = 0; i < 25; i++)
				temp.add(deck.pop());
			int y = 0;
			for(int i = 0; i<3; i++)
			{
				String card = deck.pop();
				int x = card.charAt(0);
				if (!Character.isDigit((char)x))
					x = 10;
				else
					x -= 48;
				y+=x;
				deck.pop();
			}
			for(int i = temp.size()-1; i >= 0; i--)
				deck.push(temp.get(i));
			Collections.reverse(deck);
			for(int i = 0; i <= 25;i++)
				deck.pop();
			System.out.printf("Case %d: %s\n", t, deck.pop());
		}
	}
}