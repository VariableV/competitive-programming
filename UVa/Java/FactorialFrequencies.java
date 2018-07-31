import java.io.*;
import java.math.*;
import java.util.Hashtable;
public class FactorialFrequencies{
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
		memo.put("1", BigInteger.ONE);
		memo.put("2", new BigInteger("2"));
		while(true){
			String n=key.readLine();
			if(n.equals("0"))break;
			String result=fac(new BigInteger(n)).toString();
			int[] freq=new int[10];
			for(char c : result.toCharArray()){
				freq[c-48]++;
			}
			System.out.printf("%s! --\n", n);
			System.out.printf("   (0)%5d    (1)%5d    (2)%5d    (3)%5d    (4)%5d\n",freq[0],freq[1],freq[2],freq[3],freq[4]);
			System.out.printf("   (5)%5d    (6)%5d    (7)%5d    (8)%5d    (9)%5d\n",freq[5],freq[6],freq[7],freq[8],freq[9]);
		}
	}
}