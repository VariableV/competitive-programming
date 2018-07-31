import java.util.*;

public class WERTYU
{
	public static void main(String[] args)
	{
		String rowZero = "`1234567890-=", rowOne = "QWERTYUIOP[]\\", rowTwo = "ASDFGHJKL;'", rowThree = "ZXCVBNM,./";

		Scanner key = new Scanner(System.in);

		while(key.hasNextLine())
		{
			String input = key.nextLine();

			char[] charr = input.toCharArray();
			String retStr = "";
			for (char c : charr)
			{
				int res0 = rowZero.indexOf(""+c), res1 = rowOne.indexOf(""+c), res2 = rowTwo.indexOf(""+c), res3 = rowThree.indexOf(""+c);
				if (res0 > 0 || res1 > 0 || res2 > 0 || res3 > 0)
				{
					int current = Math.max(Math.max(res0,res1), Math.max(res2,res3));
					retStr += (current==res0) ? rowZero.charAt(current-1) : (current==res1) ? rowOne.charAt(current-1) : (current==res2) ? rowTwo.charAt(current-1) : rowThree.charAt(current-1);
				}
				else
					retStr += c;
			}

			System.out.println(retStr);
		}

		key.close();
	}
}