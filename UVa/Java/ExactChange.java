import java.io.*;
import java.util.*;
public class ExactChange{
	static int[] coins;
	static boolean[] trace;
	static int minchg(int val){
		if (val<=0) return 0;
		int ans=Integer.MAX_VALUE;
		for(int i = 0; i < coins.length; i++){
			ans=1+Math.min(ans,minchg(val-coins[i]));
		}
		return ans;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(key.readLine());
		while(n-->0){
			int total=Integer.parseInt(key.readLine());
			int t=Integer.parseInt(key.readLine());
			coins=new int[t];
			for(int i = 0; i < t; i++){
				coins[i]=Integer.parseInt(key.readLine());
			}
			Arrays.sort(coins);
			System.out.println(minchg(total));
		}
	}
}