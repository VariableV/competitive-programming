import java.util.*;

public class SumOfConsecutivePrimes
{
	static boolean isPrime(int n)
	{
		for(int i = 2; i < n; i++)
			if (n%i==0) 
				return false;
		return true;
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> primes = new ArrayList<>(); primes.add(2); primes.add(3);
		for(int i = 5; i < 10000; i++)
			if(isPrime(i))
				primes.add(i);
		int[] resarr = new int[10001];
		for(int i = 0; i < primes.size(); i++)
		{
			int idx = 0;
			for (int c = i; c < primes.size(); c++)
			{
				idx += primes.get(c);
				if (idx > 10000) break;
				resarr[idx]++;
			}
		}
		Scanner key = new Scanner(System.in);
		while(true)
		{
			int n = key.nextInt();
			if (n==0) break;
			System.out.println(resarr[n]);
		}
	}
}