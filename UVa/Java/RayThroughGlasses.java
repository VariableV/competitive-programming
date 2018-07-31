import java.io.*;
import java.util.*;
import java.math.*;
public class RayThroughGlasses{
	static Hashtable<Integer, BigInteger> memo;
	static BigInteger fib(int n){
		if (memo.containsKey(n)){
			return memo.get(n);
		}
		BigInteger result=fib(n-1).add(fib(n-2));
		memo.put(n, result);
		return result;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String s;
		memo=new Hashtable<>();
		memo.put(0, BigInteger.ZERO);
		memo.put(1, BigInteger.ONE);
		while((s=key.readLine())!=null){
			int N=Integer.parseInt(s);
			N+=2;
			System.out.println(fib(N));
		}
	}
}