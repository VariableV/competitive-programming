import java.io.*;
import java.util.*;
public class MaximumGCD{
	static int gcd(int a, int b){
		return b==0 ? a : gcd(b, a%b);
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(key.readLine());
		while(T-->0){
			String[] line=key.readLine().split("\\s+");
			Hashtable<Integer, Integer> tested=new Hashtable<>();
			int maxgcd=1;
			for(int i = 0; i < line.length; i++){
				for(int j = 0; j < line.length; j++){
					if (i==j) continue;
					try{if (tested.get(i)==j || tested.get(j)==i) continue;}catch(Exception e){}
					maxgcd=Math.max(maxgcd, gcd(Integer.parseInt(line[i]),Integer.parseInt(line[j])));
					tested.put(i,j);
					tested.put(j,i);
				}
			}
			System.out.println(maxgcd);
		}
	}
}