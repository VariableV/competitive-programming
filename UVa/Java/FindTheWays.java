import java.io.*;
import java.util.Hashtable;
public class FindTheWays{
	static Hashtable<Double, Double> memo;
	static double fac(double d){
	//	if (memo.containsKey(d)) return memo.get(d);
		double result=Math.log10(d);
		while(--d>0){
			result+=Math.log10(d);
		}
	//	memo.put(d, result);
		return result;
	}
	public static void main(String[] args)throws IOException{
		long time=System.currentTimeMillis();
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String s;
		memo=new Hashtable<>();
		while((s=key.readLine())!=null){
			String[] line=s.split("\\s+");
			double n=Integer.parseInt(line[0]), k=Integer.parseInt(line[1]);
			System.out.println((int)(fac(n)-(fac(k) + fac(n-k)))+1);
		}
		long etime = System.currentTimeMillis();
		System.out.printf("hi: %d\n",etime-time);
	}
}