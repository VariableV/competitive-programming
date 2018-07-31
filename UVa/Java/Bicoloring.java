import java.io.*;
import java.util.*;
public class Bicoloring{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int N=Integer.parseInt(key.readLine());
			if (N==0)break;
			boolean[][] adj=new boolean[N][N];
			int edges=Integer.parseInt(key.readLine());
			while(edges-->0){
				String[] line=key.readLine().split("\\s+");
				int a=Integer.parseInt(line[0]), b=Integer.parseInt(line[1]);
				adj[a][b]=true;
				adj[b][a]=true;
			}
			int[] colors=new int[N];
			Arrays.fill(colors,Integer.MAX_VALUE);
			Queue<Integer> bfs=new LinkedList<>();
			boolean bipartite=true;
			for(int i = 0; bipartite && i < N; i++){
				if (colors[i]!=Integer.MAX_VALUE) continue;
				if (bfs.size()>0) bfs.clear();
				bfs.add(i);
				colors[i]=0;
				while(bipartite && bfs.size()>0){
					int node=bfs.poll();
					for(int j = 0; j < N; j++){
						if (node==j || !adj[node][j]) continue;
						if (colors[j]==Integer.MAX_VALUE){
							colors[j] = colors[node] == 0 ? 1 : 0;
							bfs.offer(j);
						}
						else if(colors[j]==colors[node]){
							bipartite=false;
							break;
						}
					}
				}
			}
			System.out.println((bipartite ? "BICOLORABLE." : "NOT BICOLORABLE."));
		}
	}
}