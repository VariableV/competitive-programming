import java.io.*;
public class CountTheFactors{
	static int[] factors;
	static void modsieve(){
		for(int i = 2; i < factors.length; i++){
			if (factors[i]==0){
				for(int j = i; j < factors.length; j+=i){
					factors[j]++;
				}
			}
		}
	}
	public static void main(String[] args)throws IOException{
		factors=new int[1_000_001];
		modsieve();
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int N=Integer.parseInt(key.readLine());
			if(N==0)break;
			System.out.printf("%d : %d\n", N, factors[N]);
		}
	}
}