import java.util.*;

public class Nlogonia
{
	public static void main(String[] args)
	{
	  	Scanner key = new Scanner(System.in);
		int n = key.nextInt();
		while(true)
		{
			if (n == 0)
				break;

			int divx = key.nextInt(), divy = key.nextInt();

			while(n-- > 0)
			{
				int x = key.nextInt(), y = key.nextInt();
				if (x == divx || y == divy)
				{
					System.out.printf("divisa\n");
				}
				else
				{
					if (x > divx && y > divy)
						System.out.printf("NE\n");
					else if (x < divx && y < divy)
						System.out.printf("SO\n");
					else if (x > divx && y < divy)
						System.out.printf("SE\n");
					else if (x < divx && y > divy)
						System.out.printf("NO\n");
				}
			}

			n = key.nextInt();
		}
		key.close();
	}
}