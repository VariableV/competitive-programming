import java.util.*;
import java.math.*;

public class MODEX
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int n = key.nextInt();
		while(n-- > 0)
		{
			BigInteger x = new BigInteger(key.next()), y = new BigInteger(key.next()), z = new BigInteger(key.next());
			System.out.println(x.modPow(y,z));
		}
	}
}