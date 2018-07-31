import java.util.*;

public class BafanaBafana
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int n = key.nextInt();
		for(int i = 1; i <= n; i++)
		{
			int N = key.nextInt(), K = key.nextInt(), P = key.nextInt();
			int res = (K+P)%N;
			System.out.printf("Case %d: %d\n", i, (res==0) ? N : res);
		}
	}
}