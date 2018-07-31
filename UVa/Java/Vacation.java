import java.io.*;
public class Vacation{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int T=1;
		while(true){
			String str0=key.readLine();
			if(str0.equals("#")) break;
			String str1=key.readLine();
			int[][] mat=new int[str0.length()+1][str1.length()+1];
			for(int r = 1; r < mat.length; r++){
				for(int c = 1; c < mat[r].length; c++){
					if (str0.charAt(r-1)==str1.charAt(c-1)){
						mat[r][c]=mat[r-1][c-1]+1;
					}
					else{
						mat[r][c]=Math.max(mat[r][c-1], mat[r-1][c]);
					}
				}
			}
			System.out.printf("Case #%d: you can visit at most %d cities.\n", T++, mat[str0.length()][str1.length()]);
		}
	}
}