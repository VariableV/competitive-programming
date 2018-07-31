import java.util.*;
import java.io.*;
public class MischievousChildren{
	static Hashtable<Long, Long> mem;
	static long fac(long N){
		if (mem.containsKey(N)) return mem.get(N);
		long result = N * fac(N-1);
		mem.put(N, result);
		return result;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		mem=new Hashtable<>();
		long tmp=0;mem.put(tmp,tmp+1);mem.put(++tmp,tmp++); mem.put(tmp,tmp);
		int N=Integer.parseInt(key.readLine());
		for(int i = 1; i <= N; i++){
			String str=key.readLine();
			long result=fac(str.length());
			long[] freq=new long[26];
			for(char c : str.toCharArray()){
				freq[c-65]++;
			}
			for(long val : freq){
				result/=fac(val);
			}
			System.out.printf("Data set %d: %d\n", i, result);
		}
	}
}