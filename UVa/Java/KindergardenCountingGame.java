import java.util.*;

public class KindergardenCountingGame
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		while(key.hasNextLine())
		{
			String str = key.nextLine();
			String[] splits = str.split("[a-zA-Z]+");
			System.out.println(splits.length-1);
		}
	}
}