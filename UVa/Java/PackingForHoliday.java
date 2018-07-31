import java.util.*;

public class PackingForHoliday
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int n = key.nextInt();
		for(int i = 1; i <= n; i++)
		{
			int x = key.nextInt(), y= key.nextInt(), z=key.nextInt();
			System.out.printf("Case %d: %s\n", i, (x <= 20 && y <= 20 && z <= 20) ? "good" : "bad");
		}
		key.close();
	}
}