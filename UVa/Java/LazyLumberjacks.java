import java.util.*;

public class LazyLumberjacks
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int n = key.nextInt();
		while(n-- > 0)
		{
			int[] arr = {key.nextInt(), key.nextInt(), key.nextInt()};
			Arrays.sort(arr);
			System.out.println((arr[0]+arr[1]>arr[2]) ? "OK" : "Wrong!!");
		}
	}
}