import java.util.*;
import java.io.*;
public class BombsNoMines{
	static int[][] delta={{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args)throws IOException{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] $l = input.readLine().split("\\s+");
			int R=Integer.parseInt($l[0]), C=Integer.parseInt($l[1]);
			if (R==0&&C==0) break;
			int[][] map=new int[R][C], dist=new int[R][C];
			for(int i = 0; i < dist.length; i++){
				Arrays.fill(dist[i], Integer.MAX_VALUE);
			}
			int bombs=Integer.parseInt(input.readLine());
			while(bombs-->0){
				String[] $l2 = input.readLine().split("\\s+");
				int bR=Integer.parseInt($l2[0]);
				int cols=Integer.parseInt($l2[1]);
				for(int i = 2; i < $l2.length; i++){
					map[bR][Integer.parseInt($l2[i])] = -1;
				}
			}
			String[] sl=input.readLine().split("\\s+"), el=input.readLine().split("\\s+");
			int startr=Integer.parseInt(sl[0]),startc=Integer.parseInt(sl[1]);
			int endr=Integer.parseInt(el[0]),endc=Integer.parseInt(el[1]);
			Queue<Integer> bfs=new LinkedList<>();
			dist[startr][startc] = 0;
			bfs.add(startr); bfs.add(startc);
			mainl:while(bfs.size()>0){
				int r=bfs.poll(),c=bfs.poll();
				for(int[] pos : delta){
					int sr=r+pos[0],sc=c+pos[1];
					if (sr >= R || sc >= C || sr < 0 || sc < 0) continue;
					if (map[sr][sc] == -1 || dist[sr][sc] != Integer.MAX_VALUE) continue;
					dist[sr][sc] = dist[r][c]+1;
					if (sr == endr && sc == endc){
						System.out.println(dist[sr][sc]);
						break mainl;
					}
					bfs.offer(sr);
					bfs.offer(sc);
				}
			}
		}
		input.close();
	}
}