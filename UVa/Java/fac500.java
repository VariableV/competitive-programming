// uva623 : 500!
import java.io.*;
import java.math.*;
import java.util.Hashtable;
public class fac500{
	static Hashtable<String, BigInteger> memo;
	static BigInteger fac(BigInteger N){
		if (memo.containsKey(N.toString())){
			return memo.get(N.toString());
		}
		BigInteger result = N.multiply(fac(N.subtract(memo.get("1"))));
		memo.put(N.toString(), result);
		return result;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		memo=new Hashtable<>();
		memo.put("0", new BigInteger("1"));
		memo.put("1", new BigInteger("1"));
		memo.put("2", new BigInteger("2"));
		while(true){
			String n=key.readLine();
			if(n==null)break;
			System.out.printf("%s!\n%s\n", n, fac(new BigInteger(n)));
		}
	}
}