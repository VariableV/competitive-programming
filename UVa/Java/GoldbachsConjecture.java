import java.io.*;
import java.util.*;
public class GoldbachsConjecture{
	static void runsieve(boolean[] arr){
		for(int i=2; i < arr.length; i++){
			if (arr[i]){
				for(int j=i; j<= arr.length/i; j++){
					try{arr[j*i]=false;}catch(Exception e){}
				}
			}
		}
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		boolean[] primes=new boolean[1_000_001];
		Arrays.fill(primes,true);
		runsieve(primes);
		while(true){
			int n=Integer.parseInt(key.readLine());
			if (n==0) break;
			for(int i = 3; i < primes.length; i++){
				if (primes[i] && primes[n-i]){
					System.out.printf("%d = %d + %d\n", n, Math.min(i,n-i), Math.max(i, n-i));
					break;
				}
			}
		}
	}
}