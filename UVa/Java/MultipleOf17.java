import java.util.*;
import java.math.*;

public class MultipleOf17
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		BigInteger seventeen = new BigInteger("17");
		while(true)
		{
			String str = key.next();
			if (str.equals("0")) break;
			int n = Integer.parseInt(""+str.charAt(str.length()-1))*5;
			BigInteger res = new BigInteger(str.substring(0, str.length()-1));
			if(res.subtract(new BigInteger(""+n)).mod(seventeen).equals(BigInteger.ZERO))
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}