import java.io.*;
public class LetMeCountTheWays{
	public static void main(String[]args)throws IOException{
		// f(n==0,i)=1;
		// f(n<0, i>=5)=0;
		// f(n,i)=f(n-coins[i], i)+f(n,i+1); 
		int[] coins={1,5,10,25,50};
		long[][] dp=new long[30_001][5];
		for(int i = 0; i < 5; i++){
			dp[0][i]=1;
		}
		for(int r=1; r<30_001; r++){
			for(int c=0; c<5; c++){
				long a=c>0 ? dp[r][c-1] : 0, b=r-coins[c] >= 0 ? dp[r-coins[c]][c] : 0;
				dp[r][c]=a+b;
			}
		}
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=key.readLine())!=null){
			int n=Integer.parseInt(s);
			if (dp[n][4]==1){
				System.out.printf("There is only 1 way to produce %d cents change.\n",n);
			}
			else{
				System.out.printf("There are %d ways to produce %d cents change.\n", dp[n][4],n);	
			}
		}
	}
}