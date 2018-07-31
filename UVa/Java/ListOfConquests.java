import java.util.*;

public class ListOfConquests
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		TreeMap<String, Integer> countries = new TreeMap<>();
		int n = key.nextInt();
		key.nextLine();
		while(n-->0)
		{
			String country = key.next();
			if (countries.containsKey(country))
				countries.put(country, countries.get(country)+1);
			else
				countries.put(country, 1);
			key.nextLine();
		}

		for(String country : countries.keySet())
			System.out.printf("%s %d\n", country, countries.get(country));
	}
}