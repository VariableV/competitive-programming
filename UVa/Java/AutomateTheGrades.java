import java.util.*;

public class AutomateTheGrades
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int n = key.nextInt();
		for(int i = 1; i <= n; i++)
		{
			int total = key.nextInt() + key.nextInt() + key.nextInt() + key.nextInt();
			int[] arr = {key.nextInt(), key.nextInt(), key.nextInt()};
			Arrays.sort(arr);
			total += (arr[2]+arr[1])/2;

			System.out.printf("Case %d: ", i);

			if (total >= 90)
				System.out.println('A');
			else if (total >= 80 && total < 90)
				System.out.println('B');
			else if (total >= 70 && total < 80)
				System.out.println('C');
			else if (total >= 60 && total < 70)
				System.out.println('D');
			else
				System.out.println('F');
		}
	}
}