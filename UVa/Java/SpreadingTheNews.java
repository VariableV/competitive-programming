import java.io.*;
import java.util.*;
public class SpreadingTheNews{
	public static void main(String[] arsg)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int nodes=Integer.parseInt(key.readLine());
	//	boolean[][] adj=new boolean[nodes][nodes];
		HashMap<Integer, ArrayList<Integer>> graph=new HashMap<>();
		for(int n = 0; n < nodes; n++){
			graph.put(n,new ArrayList<>());
			String[] line=key.readLine().split("\\s+");
			int connected=Integer.parseInt(line[0]);
			for(int i = 1; i <= connected; i++){
				int a=Integer.parseInt(line[i]);
				graph.get(n).add(a);
			}
		}
		int tc=Integer.parseInt(key.readLine());
		int[] dist=new int[nodes+1];
		while(tc-->0){
			Arrays.fill(dist,Integer.MAX_VALUE);
			int start=Integer.parseInt(key.readLine());
			// run breadth first until no nodes left
			Queue<Integer> bfs=new LinkedList<>();
			bfs.add(start);
			dist[start]=0;
			while(bfs.size()>0){
				int node=bfs.poll();
				for(int edge : graph.get(node)){
					if (dist[edge]==Integer.MAX_VALUE){
						dist[edge]=dist[node]+1;
						bfs.offer(edge);
					}
				}
			}
			dist[nodes]=Integer.MAX_VALUE;
			Arrays.sort(dist);
			int maxn=0, maxday=0,l=1;
			for(int i = 1; i <= nodes; i++){
				if (dist[i]==dist[i-1]){
					l++;
				}
				else{
					if (dist[i-1]!=Integer.MAX_VALUE && l>maxn){
						maxn=l;
						maxday=dist[i-1];
					}
					l=1;
				}
			}
			if (graph.get(start).size()==0){
				System.out.println(0);
			}
			else{
				if (maxday==0) maxday++;
				System.out.printf("%d %d\n", maxn, maxday);
			}
		}
	}
}