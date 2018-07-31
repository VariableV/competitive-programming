import java.util.*;
import java.math.*;

public class SimplifyingFractions
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int n = key.nextInt();
		while(n-- > 0)
		{
			BigInteger numerator = new BigInteger(key.next()); key.next();
			BigInteger denominator = new BigInteger(key.next());
			BigInteger factor = numerator.gcd(denominator);

			System.out.printf("%s / %s\n", numerator.divide(factor), denominator.divide(factor));
		}
	}
}