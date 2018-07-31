import java.io.*;
import java.util.*;
public class Divisors{
	static boolean[] primes;
	static int getdivisors(int N){
		int pf=2, ans=1;
		while(pf*pf <= N){
			int pow=0;
			while(N%pf==0){
				N/=pf; pow++;
			}
			ans *= (pow+1);
			while(!primes[++pf]){
			}
		}
		if (N!=1) ans*=2;
		return ans;
	}
	static void runsieve(){
		for(int i = 2; i < primes.length; i++){
			if (primes[i]){
				for(int j = 2; j < primes.length/i; j++){
					primes[i*j]=false;
				}
			}
		}
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(key.readLine());
		primes=new boolean[1_000_001];
		Arrays.fill(primes,true);
		runsieve();
		while(N-->0){
			String[] line=key.readLine().split("\\s+");
			int L=Integer.parseInt(line[0]), U=Integer.parseInt(line[1]);
			int maxn=-1, maxdiv=-1;
			for(int i = L; i <= U; i++){
				int num=getdivisors(i);
				if (num>maxdiv){
					maxn=i;
					maxdiv=num;
				}
			} 
			System.out.printf("Between %d and %d, %d has a maximum of %d divisors.\n", L, U, maxn, maxdiv);
		}
	}
}