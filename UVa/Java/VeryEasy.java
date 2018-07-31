import java.util.*;
import java.math.*;

public class VeryEasy
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		while(key.hasNextInt())
		{
			int n = key.nextInt(), a = key.nextInt();
			BigInteger total = new BigInteger("0"), aB = new BigInteger(Integer.toString(a));
			for (int i = 1; i <= n; i++)
			{
				// i * A^i
				BigInteger iB = new BigInteger(Integer.toString(i));
				total = total.add(aB.pow(i).multiply(iB));
			}
			System.out.println(total.toString());
		}
	}
}