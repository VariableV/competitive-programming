import java.io.*;
public class GCDLCM{
	static int gcd(int a, int b){
		return b==0 ? a : gcd(b, a%b);
	}
	static int lcm(int a, int b){
		return a * (b / gcd(a,b));
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(key.readLine());
		while(T-->0){
			String[] line=key.readLine().split("\\s+");
			int a=Integer.parseInt(line[0]),b=Integer.parseInt(line[1]);
			System.out.println((gcd(a,b)==a && lcm(a,b)==b ? a + " " + b : -1)); 
		}
	}
}