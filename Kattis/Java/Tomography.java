import java.io.*;
public class Tomography{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String[] line=key.readLine().split(" ");
		int r=Integer.parseInt(line[0]), c=Integer.parseInt(line[1]);
		line=key.readLine().split(" ");
		int[] rows=new int[r],columns=new int[c];
		for(int i = 0; i < r; i++){
			rows[i]=Integer.parseInt(line[i]);
		}
		line=key.readLine().split(" ");
		for(int i = 0; i < c; i++){
			columns[i]=Integer.parseInt(line[i]);
		}
		for(int i = r-1; i>=0; i--){
			for(int j = c-1; j>=0; j--){
				if (rows[i] > 0 && columns[j] > 0){
					rows[i]--; columns[j]--;
				}
			}
		}
		boolean check=true;
		for(int i = 0; i < r; i++){
			if (rows[i]!=0){
				check=false;break;
			}
		}
		for(int i = 0; i < c; i++){
			if (columns[i]!=0){
				check=false; break;
			}
		}
		System.out.printf("%s\n", check ? "Yes" : "No");
	}
}