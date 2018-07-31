import java.util.*;
import java.io.*;
public class ZerosAndOnes{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int T=0;
		main:while(true){
			String str=key.readLine();
			if (str==null)break;
			int N=Integer.parseInt(key.readLine());
			char[] charr=str.toCharArray();
			System.out.printf("Case %d:\n",++T);
			while(N-->0){
				String[] tokens=key.readLine().split("\\s+");
				int i=Integer.parseInt(tokens[0]),j=Integer.parseInt(tokens[1]);
				boolean same=true;
				for(int c = Math.min(i,j); c < Math.max(i,j); c++){
					if (charr[c] != charr[c+1]){
						same=false;
						break;
					}
				}
				System.out.println((same ? "Yes" : "No"));
			}
		}
	}
}