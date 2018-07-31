import java.io.*;
import java.util.*;
public class SSP1{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String str;
		while(!(str=key.readLine()).equals("0 0 0 0")){
			String[] line=str.split(" ");
			int n=Integer.parseInt(line[0]), m=Integer.parseInt(line[1]), q=Integer.parseInt(line[2]), s=Integer.parseInt(line[3]);
			int[][] weighted=new int[n][n];
			HashMap<Integer, ArrayList<Integer>> adjlist=new HashMap<>();
			while(m-->0){
				line=key.readLine().split(" ");
				int a=Integer.parseInt(line[0]), b=Integer.parseInt(line[1]), w=Integer.parseInt(line[2]);
				if (!adjlist.containsKey(a)){
					adjlist.put(a, new ArrayList<>());
				}
				adjlist.get(a).add(b);
				weighted[a][b]=w;
			}
			PriorityQueue<Node> pq=new PriorityQueue<>();
			pq.add(new Node(s, 0));
			int[] dist=new int[n];
			Arrays.fill(dist,Integer.MAX_VALUE);
			dist[s]=0;
			while(pq.size()>0){
				Node no=pq.poll();
				if (adjlist.containsKey(no.N)){
					ArrayList<Integer> edges=adjlist.get(no.N);
					for(int i : edges){
						if (dist[i] > dist[no.N]+weighted[no.N][i]){
							dist[i]=dist[no.N]+weighted[no.N][i];
							pq.offer(new Node(i, dist[i]));
						}
					}
				}
			}
			while(q-->0){
				int end=Integer.parseInt(key.readLine());
				if (dist[end]==Integer.MAX_VALUE){
					System.out.println("Impossible");
				}
				else{
					System.out.println(dist[end]);
				}
			}
			System.out.println();
		}
	}
}
class Node implements Comparable<Node>{
	public int N, W;
	public Node(int n, int w){
		N=n;
		W=w;
	}
	public int compareTo(Node n){
		return	W-n.W;
	}
}