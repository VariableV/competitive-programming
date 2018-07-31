import java.util.*;

public class BoxOfBricks
{
	public static boolean isFilled(ArrayList<Integer> arr, int height)
	{
		for (int n : arr)
			if (n != height)
				return false;
		return true;
	}

	public static int largestIdx(ArrayList<Integer> arr)
	{
		int lidx = -1;
		int maxvalue = Integer.MIN_VALUE;
		for (int i = 0; i < arr.size(); i++)
		{
			int n = arr.get(i);
			if (n > maxvalue)
			{
				maxvalue = n;
				lidx = i;
			}
		}
		return lidx;
	}

	public static int smallestIdx(ArrayList<Integer> arr)
	{
		int lidx = -1;
		int minvalue = Integer.MAX_VALUE;
		for (int i = 0; i < arr.size(); i++)
		{
			int n = arr.get(i);
			if (n < minvalue)
			{
				minvalue = n;
				lidx = i;
			}
		}
		return lidx;
	}

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int columns = key.nextInt();
		int setNumber = 1;
		while(columns != 0)
		{
			ArrayList<Integer> blocks = new ArrayList<>(columns);
			int height = 0;

			for(int i = 0; i < columns; i++)
			{
				int n = key.nextInt();
				height += n;
				blocks.add(n);
			}

			height /= columns;

			int moves = 0;
			while(!isFilled(blocks, height))
			{
				int lidx = largestIdx(blocks);
				int sidx = smallestIdx(blocks);
				blocks.set(lidx, blocks.get(lidx)-1);
				blocks.set(sidx, blocks.get(sidx)+1);
				moves++;
			}

			System.out.printf("Set #%d\nThe minimum number of moves is %d.\n\n", setNumber++, moves);

			// next cycle start
			columns = key.nextInt();
		}
		ke.close();
	}
}