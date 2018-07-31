import java.io.*;
import java.util.*;
public class PrimeFactors{
	static boolean[] sieve;
	static ArrayList<Integer> primes;
	static void runsieve(){
		for(int i = 2; i*i < sieve.length; i++){
			if (sieve[i]){
				for(int j = i * i; j < sieve.length; j += i){
					sieve[j]=false;
				}
			}
		}
		for(int i = 2; i < sieve.length; i++){
			if (sieve[i]){
				primes.add(i);
			}
		}
	}
	static String primefactors(int N){
		ArrayList<Integer> pfactors = new ArrayList<>();
		long n=Math.abs(N);
		int pfidx=0, pf=primes.get(pfidx);
		while(((long)pf*pf)<=n){
			while(n%pf==0){
				n/=pf;
				pfactors.add((int)pf);
			}
			pf=primes.get(++pfidx);
		}
		if (pf!=1)pfactors.add((int)n);
		for(int i = pfactors.size()-1; i >= 0; i--)
			if (pfactors.get(i)==1)
				pfactors.remove(i);
		if (N < 0){
			pfactors.add(0, -1);
		}
		Collections.sort(pfactors);
		return pfactors.toString().replaceAll("[\\[\\]]", "").replaceAll("[,]", " x");
	}
	public static void main(String[ ]args)throws IOException{
		sieve=new boolean[1_000_001];
		Arrays.fill(sieve,true);
		primes=new ArrayList<>();
		runsieve();
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int N=Integer.parseInt(key.readLine().trim());
			if (N==0)break;
			if (N==-1){
				System.out.println("-1 = -1 x ");
			}
			else{	
				System.out.println(N + " = " + primefactors(N));		
			}
		}
	}
}