import java.util.*;
import java.math.*;

public class BasicRemains
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		while(true)
		{
			int n = key.nextInt();
			if (n==0) break;
			BigInteger num = new BigInteger(key.next(),n), num0 = new BigInteger(key.next(),n);
			System.out.println(num.mod(num0).toString(n));
		}
	}
}