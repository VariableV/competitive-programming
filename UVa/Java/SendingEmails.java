// wtf i keep getting runtime error 
import java.io.*;
import java.util.*;
public class SendingEmails{
	public static void main(String[] args)throws IOException{
		Scanner key=new Scanner(System.in);//BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int T=key.nextInt();//Integer.parseInt(key.readLine());
		for(int t = 1; t <= T; t++){
			//String[] line=key.readLine().split("\\s+");
			//int n=Integer.parseInt(line[0]), edges=Integer.parseInt(line[1]), start=Integer.parseInt(line[2]), end=Integer.parseInt(line[3]);
			int n=key.nextInt(), edges=key.nextInt(), start=key.nextInt(), end=key.nextInt();
			int bak=edges;
			boolean[][] adj=new boolean[n][n];
			int[][] weights=new int[n][n];
			for(int i = 0 ; i < n; i ++){
				for(int c = 0; c < n; c++){
					weights[i][c]=Integer.MAX_VALUE;
				}
			}
			while(edges-->0){
				//line=key.readLine().split("\\s+");
				//int a=Integer.parseInt(line[0]), b=Integer.parseInt(line[1]), weight=Integer.parseInt(line[2]);
				int a=key.nextInt(), b=key.nextInt(), weight=key.nextInt();
				try{
					adj[a][b]=true;
					adj[b][a]=true;
					weights[a][b]=Math.min(weights[a][b], weight);
					weights[b][a]=Math.min(weights[b][a], weight);
				}
				catch(Exception e){
				}
			}
			Node[] spots=new Node[n];
			for(int c=0; c <n; c++){
				spots[c]=new Node(c);
			}
			PriorityQueue<Node> dj=new PriorityQueue<>();
			spots[start].weight=0;
			dj.add(spots[start]);
			boolean reached=false;
			while(dj.size()>0){
				Node curr=dj.poll();
				if (curr.visited) continue;
				if (curr.n==end){
					reached=true;
					break;
				}
				curr.visited=true;
				for(int i = 0; i < n; i++){
					if (i!=curr.n){
						Node pot=spots[i];
						if (adj[curr.n][pot.n] && curr.weight + weights[curr.n][pot.n] < pot.weight){
							pot.weight=curr.weight + weights[curr.n][pot.n];
							dj.add(pot);
						}
					}
				}
			}
			System.out.printf("Case #%d: %s\n", t, (reached) ? Integer.toString(spots[end].weight) : "unreachable");
		}
	}
}
class Node implements Comparable<Node>{
	public int n, weight;
	public boolean visited;
	public Node(int N){
		n=N;
		weight=Integer.MAX_VALUE;
		visited=false;
	}
	public int compareTo(Node N){
		return weight - N.weight;
	}
	public String toString(){
		return String.format("%d %b : %d", n, visited, weight);
	}
}