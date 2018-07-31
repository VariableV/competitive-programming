import java.util.*;
import java.math.*;

public class Pseudoprimes
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		while(true)
		{
			String p = key.next(), a = key.next();
			if(p.equals("0") && a.equals("0")) break;
			BigInteger bp = new BigInteger(p), ba = new BigInteger(a);
			System.out.println((!bp.isProbablePrime(10) && ba.modPow(bp,bp).equals(ba)) ? "yes" : "no");
		}
	}
}