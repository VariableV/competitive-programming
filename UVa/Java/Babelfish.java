import java.util.*;

public class Babelfish
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		Hashtable<String, String> dict = new Hashtable<>();
		while(true)
		{
			String str = key.nextLine();
			if (str.equals("")) break;
			String[] strs = str.split("\\s+");
			dict.put(strs[1], strs[0]);
		}
		while(key.hasNext())
		{
			String word = key.next();
			if(dict.containsKey(word))
				System.out.println(dict.get(word));
			else
				System.out.println("eh");
		}
	}
}