import java.util.*;
import java.io.*;
public class NumberMaze{
	static int[][] delta = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(key.readLine());
		while(N-->0){
			int R=Integer.parseInt(key.readLine()), C=Integer.parseInt(key.readLine());
			int[][] graph=new int[R][C], dist=new int[R][C];
			for(int r=0; r<R; r++){
				String[] line=key.readLine().split("\\s+");
				for(int c=0; c<C; c++){
					graph[r][c]=Integer.parseInt(line[c]);
					dist[r][c]=Integer.MAX_VALUE;
				}
			}
			dist[0][0]=graph[0][0];
			PriorityQueue<DijkstraNode> heap=new PriorityQueue<>();
			heap.add(new DijkstraNode(0,0,dist[0][0]));
			while(heap.size()>0){
				DijkstraNode node=heap.poll();
				int r=node.r,c=node.c,ndist=node.dist;
				if (ndist>dist[r][c]) continue;
				for(int[] pos:delta){
					int nr=r+pos[0],nc=c+pos[1];
					if (nr >= R || nc >= C || nr < 0 || nc < 0) continue;
					if (dist[r][c] + graph[nr][nc] < dist[nr][nc]){
						dist[nr][nc] = dist[r][c] + graph[nr][nc];
						heap.offer(new DijkstraNode(nr,nc,dist[nr][nc]));
					}
				}
			}
			System.out.println(dist[R-1][C-1]);
		}
		key.close();
	}
}
class DijkstraNode implements Comparable<DijkstraNode>{
	public int dist, r, c;
	public DijkstraNode(int r, int c, int dist){
		this.dist=dist; this.r=r; this.c=c;
	}
	public int compareTo(DijkstraNode d){
		return dist-d.dist;
	}
}