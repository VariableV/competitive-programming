import java.io.*;
import java.util.*;
public class PrimeCuts{
	public static void main(String[] args)throws Exception{
		boolean[] sieve=new boolean[1_001];
		Arrays.fill(sieve,true);
		for(int i = 2; i < sieve.length; i++){
			if (sieve[i]){
				for(int j=i*i; j<sieve.length; j+=i){
					sieve[j]=false;
				}
			}
		}
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=key.readLine())!=null){
			String[] split=s.split(" ");
			int n=Integer.parseInt(split[0]),c=Integer.parseInt(split[1]);
			ArrayList<Integer> primes=new ArrayList<>();
			for(int i = 1; i <= n; i++){
				if (sieve[i]) primes.add(i);
			}
			System.out.printf("%d %d: ", n, c);
			String res="";
			int nums=primes.size()%2==0 ? 2*c : 2*c-1;
			if (nums>=primes.size()){
				for(int i : primes)res+=i +" ";
			}
			else{
				int start=primes.size()/2-1;
				for(int i = start; i < start+nums; i++){
					res+=primes.get(i)+" ";
				}
			}
			System.out.println(res.trim());
		}
	}
}