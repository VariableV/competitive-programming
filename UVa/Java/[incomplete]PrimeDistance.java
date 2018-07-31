import java.io.*;
import java.util.*;
public class PrimeDistance{
	static boolean[] primelist;
	static Hashtable<Integer, Boolean> calcd;
	static void runsieve(boolean[] primes){
		for(int i = 2; i < primes.length; i++){
			if(primes[i]){
				for(int j = 2; j < primes.length/i; j++){
					primes[j*i]=false;
				}	
			}
		}
	}
	static boolean isprime(int n){
		if (n < 1_000_000){
			return primelist[n];
		}
		if (calcd.containsKey(n)){
			return calcd.get(n);
		}
		int max=(int)Math.sqrt(n);
		for(int i=2; i <= max; i++){
			if (n%i==0){
				calcd.put(n, false);
				return false;
			}
		}
		calcd.put(n,true);
		return true;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		primelist=new boolean[1_000_001];
		calcd=new Hashtable<>();
		Arrays.fill(primelist,true);
		runsieve(primelist);
		primelist[1]=false;
		while(true){
			String ln=key.readLine();
			if (ln==null)break;
			String[] l=ln.split("\\s+");
			int L=Integer.parseInt(l[0]), U=Integer.parseInt(l[1]);
			int[] mindist = {Integer.MAX_VALUE, -1, -1}, maxdist = {Integer.MIN_VALUE, -1, -1};
			for(int i = L; i < U; i++){
				if (isprime(i)){
					int c=i+1, dist=1;
					while(!isprime(++c) && c < U){
						dist++;
					}
					if (mindist[0] > dist){
						mindist[0]=dist; mindist[1]=i; mindist[2]=c;
					}
					if (dist > maxdist[0]){
						maxdist[0]=dist; maxdist[1]=i; maxdist[2]=c;
					}
				}
			}
			if (mindist[0]==Integer.MAX_VALUE){
				System.out.printf("There are no adjacent primes.\n");
			}
			else{
				System.out.printf("%d,%d are closest, %d,%d are most distant.\n", mindist[1], mindist[2], maxdist[1], maxdist[2]);
			}
		}
	}
}