import java.io.*;
import java.util.Arrays;
public class IrreducableBasicFractions{
	static boolean[] primes;
	static void sieve(){
		for(int i = 2; i < primes.length; i++){
			if(primes[i]){
				for(int j = 2; j < primes.length/i; j++){
					primes[i*j]=false;
				}
			}
		}
	}
	static int eulersphi(int n){
		int pf=2, ans=n;
		while(pf*pf <= n){
			if (n%pf==0) ans -= ans/pf;
			while(n%pf==0)n/=pf;
			while(!primes[++pf]){}
		}
		if (n!=1) ans -= ans/n;
		return ans;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		primes=new boolean[1_000_001];
		Arrays.fill(primes,true);
		sieve();
		String s;
		while(!(s=key.readLine()).equals("0")){
			int N=Integer.parseInt(s);
			System.out.printf("%d\n", eulersphi(N));
		}
	}
}