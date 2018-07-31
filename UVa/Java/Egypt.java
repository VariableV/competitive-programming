import java.util.*;

public class Egypt
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		while(true)
		{
			int x = key.nextInt(), y = key.nextInt(), z = key.nextInt();
			if(x == 0 && y == 0 && z == 0) break;
			int[] arr = {x,y,z};
			Arrays.sort(arr);
			System.out.println((arr[0]*arr[0]+arr[1]*arr[1]==arr[2]*arr[2]) ? "right" : "wrong");
		}
		key.close();
	}
}