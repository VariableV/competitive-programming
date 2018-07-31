import java.io.*;
public class CoinChange{
	static int[] coins={1,5,10,25,50};
	static int[][] memo;
	public static void main(String[] args)throws IOException{
		memo=new int[8000][5];
		for(int i = 0; i < 5; i++){
			memo[0][i]=1;
		}
		for(int i =1; i < memo.length; i++){
			for(int j = 0; j < 5; j++){
				int a=j>0 ? memo[i][j-1] : 0, b=i-coins[j] > -1 ? memo[i-coins[j]][j] : 0;
				memo[i][j]=a+b;
			}
		}
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=key.readLine())!=null){
			int n=Integer.parseInt(s);
			System.out.println(memo[n][4]);
		}
	}
}