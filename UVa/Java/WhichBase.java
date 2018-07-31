import java.util.*;

public class WhichBase
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		while(key.hasNext())
		{
			String num = key.next(), num2 = key.next();
			int bb=-1, bb2=-1;
			outer: for(int b1 = 1; b1 <= 36; b1++)
			{
				for (int b2 = 1; b2 <= 36; b2++)
				{
					long numero = -1, numert = -1;
					try{
						numero = Long.parseLong(num, b1);
						numert = Long.parseLong(num2, b2);
					}catch(NumberFormatException e){ continue; }
					if (numero == numert)
					{
						bb =b1;bb2=b2;
						break outer;
					}
				}
			}

			if(bb==-1 && bb2==-1)
				System.out.printf("%s is not equal to %s in any base 2..36\n",num,num2);
			else
				System.out.printf("%s (base %d) = %s (base %d)\n", num, bb, num2, bb2);
		}
	}
}