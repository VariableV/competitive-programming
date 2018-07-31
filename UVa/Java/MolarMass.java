import java.util.*;

public class MolarMass
{
	private static boolean isnum(char c)
	{
		return !(c >= 65 && c <= 90);
	}

	public static void main(String[] args)
	{
		Hashtable<Character, Double> info = new Hashtable<>();
		info.put('C', 12.01); info.put('H', 1.008); info.put('O', 16.0); info.put('N', 14.01); 
		Scanner key = new Scanner(System.in);
		int n = key.nextInt();
		key.nextLine();
		while(n-->0)
		{
			String str = key.nextLine().trim();
			char[] arr = str.toCharArray();
			double mass = 0;
			for(int i = 0; i < arr.length; i++)
			{
				if (isnum(arr[i])) continue;

				if (i+1 < arr.length)
				{
					if (isnum(arr[i+1]))
					{
						int stop = i+2;
						while(stop < arr.length && isnum(arr[stop]))
							stop++;
						int numero = Integer.parseInt(str.substring(i+1, stop));
						mass += info.get(arr[i])*numero;
						continue;	
					}
				}
				mass += info.get(arr[i]);
			}

			System.out.printf("%.3f\n", mass);
		}
	}
}