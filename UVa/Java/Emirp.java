import java.util.*;
import java.math.*;

public class Emirp
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		while(key.hasNext())
		{
			BigInteger num = new BigInteger(key.next());
			if (num.isProbablePrime(10))
			{
				String rev = (new StringBuffer(num.toString())).reverse().toString();
				if (rev.equals(num.toString())){
					System.out.printf("%s is prime.\n", num);
					continue;
				}

				if ((new BigInteger(rev)).isProbablePrime(10))
					System.out.printf("%s is emirp.\n", num);
				else 
					System.out.printf("%s is prime.\n", num);
			}
			else
				System.out.printf("%s is not prime.\n", num);
		}
	}
}