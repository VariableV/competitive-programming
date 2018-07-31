import java.util.*;

public class OneTwoThree
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int n = key.nextInt();
		while(n-- > 0)
		{
			String str = key.next();
			if (str.length() == 5)
				System.out.println(3);
			else 
			{
				char[] c = str.toCharArray();
				if ((c[0]=='o'&&c[2]=='e')||(c[0]=='o'&&c[1]=='n')||(c[1]=='n'&&c[2]=='e'))
					System.out.println(1);
				else
					System.out.println(2);
			}
		}
		key.close();
	}
}