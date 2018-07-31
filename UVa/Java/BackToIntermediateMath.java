import java.util.*;

public class BackToIntermediateMath
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int n = key.nextInt();
		for(int i = 1; i <= n; i++)
		{
			System.out.printf("Case %d: ", i);
			double d=key.nextInt(),v=key.nextInt(),u=key.nextInt();
			if(v>=u||v==0||u==0)
			{
				System.out.println("can't determine");
				continue;
			}
			System.out.printf("%.3f\n", Math.abs((d/u)-(d/Math.sqrt(Math.pow(u,2)-Math.pow(v,2)))));
		}
	}
}