import java.util.*;
import java.math.*;

public class Product
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		while(key.hasNext())
		{
			BigInteger x = new BigInteger(key.next()), y = new BigInteger(key.next());
			System.out.println(x.multiply(y));
		}
	}
}