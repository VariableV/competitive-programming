import java.util.*;
import java.math.*;

public class AddingReversedNumbers
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int n = key.nextInt();
		while(n-- > 0)
		{
			BigInteger n1 = new BigInteger((new StringBuffer(key.next())).reverse().toString());
			BigInteger n2 = new BigInteger((new StringBuffer(key.next())).reverse().toString());
			System.out.println((new StringBuffer(n1.add(n2).toString())).reverse().toString().replaceFirst("^0+(?!$)", ""));
		}
	}
}