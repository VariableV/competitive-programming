import java.io.*;
public class Continents{
	static char[][] grid;
	static boolean[][] visited;
	static char landmark;
	static int sum;
	static void floodfill(int r, int c){
		if (c < 0) c=grid[0].length-1;
		if (c >= grid[0].length) c=0;
		if (r < 0 || r>=grid.length) return;
		if (grid[r][c]!=landmark || visited[r][c]) return;
		visited[r][c]=true;
		sum++;
		floodfill(r-1,c);
		floodfill(r+1,c);
		floodfill(r,c-1);
		floodfill(r,c+1);
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=key.readLine())!=null){
			String[] line=s.split("\\s+");
			int sr=Integer.parseInt(line[0]), sc=Integer.parseInt(line[1]);
			grid=new char[sr][sc];
			visited=new boolean[sr][sc];
			for(int i = 0; i < sr; i++){
				grid[i]=key.readLine().toCharArray();
			}
			line=key.readLine().split("\\s+");
			int pr=Integer.parseInt(line[0]), pc=Integer.parseInt(line[1]);
			landmark=grid[pr][pc];
			floodfill(pr,pc);
			int maxsz=0;
			for(int i = 0; i < sr; i++){
				for(int j = 0; j < sc; j++){
					sum=0;
					floodfill(i,j);
					maxsz=Math.max(maxsz,sum);
				}
			}
			System.out.println(maxsz);
			key.readLine();
		}
	}
}