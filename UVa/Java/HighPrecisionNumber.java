import java.util.*;
import java.math.*;

public class HighPrecisionNumber
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int n = key.nextInt();
		key.nextLine();
		while(n-- > 0)
		{
			ArrayList<BigDecimal> numbers = new ArrayList<>();
			while(true)
			{
				String str = key.nextLine();
				if (str.equals("0")) break;
				numbers.add(new BigDecimal(str));
			}

			BigDecimal sum = new BigDecimal("0");
			for(BigDecimal num : numbers)
				sum = sum.add(num);

			String res = sum.toPlainString();
			char[] arr = res.toCharArray();
			int lastIdx = arr.length-1;
			while(lastIdx >= 0 && arr[lastIdx]=='0') lastIdx--;
			if (lastIdx >= 0 && arr[lastIdx]=='.') lastIdx--;

			System.out.println(res.substring(0,lastIdx+1));
		}
	}
}