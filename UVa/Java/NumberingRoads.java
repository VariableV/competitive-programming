import java.io.*;
public class NumberingRoads{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int T=1;
		while(true){
			String[] line=key.readLine().split("\\s+");
			int N=Integer.parseInt(line[0]),R=Integer.parseInt(line[1]);
			if (N==0&&R==0)break;
			int ans=0;
			N-=R;
			if (N<=0){
				System.out.printf("Case %d: %d\n", T++,0);
			}
			else{
				mainl:for(char c = 'A'; c <= 'Z'; c++){
					ans++;
					for(int i = 1; i <= R; i++){
						if (--N==0)break mainl;
					}
				}
				if (N>0){
					System.out.printf("Case %d: impossible\n", T++);
				}
				else{
					System.out.printf("Case %d: %d\n", T++, ans);
				}
			}
		}
	}
}