import java.io.*;
public class Battleships{
	static boolean[][] visited;
	static char[][] grid;
	static void floodfill(int r, int c){
		if (r < 0 || c < 0 || r >= grid.length || c >= grid.length) return;
		if (visited[r][c]) return;
		if (grid[r][c]=='.') return;
		visited[r][c]=true;
		floodfill(r-1,c);
		floodfill(r+1,c);
		floodfill(r,c-1);
		floodfill(r,c+1);
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(key.readLine());
		for(int cs = 1; cs <= T; cs++){
			int size=Integer.parseInt(key.readLine());
			grid=new char[size][size];
			visited=new boolean[size][size];
			for(int i = 0; i < size; i++){
				grid[i]=key.readLine().toCharArray();
			}
			int count=0;
			for(int i = 0; i < size; i++){
				for(int j = 0; j < size; j++){
					if (!visited[i][j] && grid[i][j]=='x'){
						count++;
						floodfill(i,j);
					}
				}
			}
			System.out.printf("Case %d: %d\n", cs, count);
		}
	}
}