import java.util.*;
import java.math.*;

public class BasicallySpeaking
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		while(key.hasNextLine())
		{
			String[] arr = key.nextLine().trim().split("\\s+");
			String num = arr[0].trim();
			int base = Integer.parseInt(arr[1].trim()), convertTo = Integer.parseInt(arr[2].trim());
			BigInteger numb = new BigInteger(num, base);
			String res = numb.toString(convertTo);
			System.out.printf("%7s\n", (res.length()<=7) ? res.toUpperCase() : "ERROR");
		}
	}
}