import java.io.*;
import java.math.BigInteger;
public class BigMod{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=key.readLine())!=null){
			BigInteger B,P,M;
			if (!s.equals("")){
				B=new BigInteger(s);
			}
			else{
				B=new BigInteger(key.readLine());
			}
			P=new BigInteger(key.readLine()); M=new BigInteger(key.readLine());
			System.out.println(B.modPow(P,M));
		}
	}
}