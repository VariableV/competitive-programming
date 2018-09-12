/*
ID: student27
LANG: JAVA
TASK: transform
*/
import java.io.*;
public class transform{
	static int n;
	static char[][] rotate(char[][] grid){
		char[][] retn = new char[n][n];
		for(int r = 0; r < n; r++){
			for(int c = 0; c < n; c++){
				retn[c][n-1-r] = grid[r][c];
			}
		}
		return retn;
	}
	static char[][] reflect(char[][] grid){
		char[][] retn = new char[n][n];
		for(int r = 0; r < n; r++){
			for(int c = 0; c < n; c++){
				retn[r][c] = grid[r][n-c-1];
			}
		}
		return retn;
	}
	static boolean cmp(char[][] grid, char[][] grid0){
		for(int r = 0; r < n; r++){
			for(int c = 0; c < n; c++){
				if (grid[r][c] != grid0[r][c]) return false;
			}
		}
		return true;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new FileReader("transform.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("transform.out")));
		n=Integer.parseInt(key.readLine());
		char[][] original = new char[n][n], transposed = new char[n][n];
		for(int i = 0; i < n; i++){
			original[i] = key.readLine().toCharArray();
		}
		for(int i = 0; i < n; i++){
			transposed[i] = key.readLine().toCharArray();
		}
		/*char[][] xd=reflect(original);
		for (int r=0; r<n; r++){
			String str="";
			for(int c=0; c<n; c++){
				str += xd[r][c];
			}
			out.println(str);
		}*/

		char[][] c90=rotate(original), c180=rotate(c90), c270=rotate(c180), ref=reflect(original), r90=rotate(ref), r180=rotate(r90), r270=rotate(r180);
		if (cmp(c90, transposed)){
			out.println(1);
		}
		else if (cmp(c180,transposed)){
			out.println(2);
		}
		else if (cmp(c270,transposed)){
			out.println(3);
		}
		else if (cmp(ref, transposed)){
			out.println(4);
		}
		else if (cmp(r90, transposed) || cmp(r180,transposed) || cmp(c270,transposed)){
			out.println(5);
		}
		else if (cmp(original, transposed)){
			out.println(6);
		}
		else{
			out.println(7);
		}
		out.close();
	}
}