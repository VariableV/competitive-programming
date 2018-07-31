import java.util.*;

public class SimpleDivision
{
	private static boolean divByAll(ArrayList<Integer> arr, int modulo)
	{
		int mod = -1;
		for(int i : arr)
		{	
			if (mod == -1)
			{	
				mod = i % modulo;
			}
			else {
				if (i % modulo != mod) return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		while(true)
		{
			int num = key.nextInt();
			if (num == 0) break;
			ArrayList<Integer> list = new ArrayList<>();
			list.add(num);
			while(true)
			{
				int n = key.nextInt();
				if (n==0) break;
				list.add(Math.abs(n));
			}

			Collections.sort(list);
			int max_rem = 0;
			for(int i = 1; i <= list.get(0); i++)
			{
				if (divByAll(list, i))
					max_rem = i;
			}

			System.out.println(max_rem);
		}
	}
}