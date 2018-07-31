import java.io.*;
import java.util.*;
public class GuessingGame{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		boolean[] mat=new boolean[11];
		Arrays.fill(mat, true);
		while(true){
			int n=Integer.parseInt(key.readLine());
			if (n==0)break;
			String move=key.readLine();
			if (move.equals("right on")){
				System.out.printf("%s\n", mat[n] ? "Stan may be honest" : "Stan is dishonest");
				Arrays.fill(mat,true);
			}
			else if (move.equals("too high")){
				for(int i = n; i <= 10; i++){
					mat[i]=false;
				}
			}
			else if (move.equals("too low")){
				for(int i = 0; i <= n; i++){
					mat[i]=false;
				}	
			}
		}
	}
}