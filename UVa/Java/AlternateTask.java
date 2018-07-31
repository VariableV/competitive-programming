import java.io.*;
import java.util.Arrays;
public class AlternateTask{
	static boolean[] primes;
	static void sieve(){
		for(int i = 2; i < primes.length; i++){
			if(primes[i]){
				for(int j = 2; j < primes.length/i; j++){
					primes[i*j]=true;
				}
			}
		}
	}
	static int sumdiv(int N){
		int pf=2, ans=1;
		while(pf*pf<=N){
			int pow=0;
			while(N%pf==0){
				N/=pf; pow++;
			}
			ans *= ((int)Math.pow((double)pf, pow+1.0)-1)/(pf-1);
			while(!primes[++pf]){}
		}
		if (N!=1) ans*=((int)Math.pow((double)N, 2.0)-1)/(N-1);
		return ans;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		primes=new boolean[1_000_001];
		Arrays.fill(primes,true);
		sieve();
		String s;
		int T=1;
		while(!(s=key.readLine()).equals("0")){
			int S=Integer.parseInt(s), res=-1;
			for(int i = 1; i < S; i++){
				if (sumdiv(i)==S){
					res=i;
				}
			}
			System.out.printf("Case %d: %d\n", T++, S==1 ? 1 : res);
		}
	}
}