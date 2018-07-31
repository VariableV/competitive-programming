import java.io.*;
public class CoinCollector{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(key.readLine());
		while(N-->0){
			int C=Integer.parseInt(key.readLine());
			int[] coins=new int[C];
			String[] line=key.readLine().split("\\s+");
			int sum=0, count=0;
			for(int i = 0; i < coins.length; i++){
				coins[i]=Integer.parseInt(line[i]);
			}
			for(int i = 0; i < coins.length-1; i++){
				if (coins[i]+sum < coins[i+1]){
					count++;
					sum += coins[i];
				}
			}
			System.out.println(count+1);
		}
	}
}