import java.io.*;
public class AllinAll{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=key.readLine())!=null){
			String[] line=s.split("\\s+");
			int[][] mat=new int[line[0].length()+1][line[1].length()+1];
			int r=0,c=0;
			for(r = 1; r < mat.length; r++){
				for(c = 1; c < mat[r].length; c++){
					if (line[0].charAt(r-1)==line[1].charAt(c-1)){
						mat[r][c]=mat[r-1][c-1]+1;
					}
					else{
						mat[r][c]=Math.max(mat[r-1][c],mat[r][c-1]);
					}
				}
			}
			System.out.println(((mat[r-1][c-1]==line[0].length()) ? "Yes" : "No"));
		}
	}
}