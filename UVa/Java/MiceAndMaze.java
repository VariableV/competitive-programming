import java.io.*;
import java.util.*;
public class MiceAndMaze{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(key.readLine());
		for(int $i = 0; $i < cases; $i++){
			if ($i > 0){
				System.out.println();
			}
			key.readLine();
			int N=Integer.parseInt(key.readLine()), E=Integer.parseInt(key.readLine()), T=Integer.parseInt(key.readLine()), edges=Integer.parseInt(key.readLine());
			int[][] weights=new int[N][N];
			boolean[][] connections=new boolean[N][N];
			Node[] n = new Node[N];
			for(int i = 0; i < N; i++){
				n[i]=new Node(i+1);
			}
			for(int i = 0; i < edges; i++){
				String[] line=key.readLine().split("\\s+");
				int from=Integer.parseInt(line[0]), to=Integer.parseInt(line[1]), weight=Integer.parseInt(line[2]);
				weights[from-1][to-1]=weight;
				connections[from-1][to-1]=true;
			}
			PriorityQueue<Node> dj=new PriorityQueue<>();
			int escaped=0;
			for(int t = 0; t < N; t++){
				if (dj.size()>0)dj.clear();
				n[t].weight=0;
				dj.add(n[t]);
				while(dj.size()>0){
					Node node=dj.poll();
					if (node.visited) continue;
					node.visited=true;
					if (node.num==E) break;
					int weight=node.weight;
					for(int i = 0; i < N; i++){
						Node pot=n[i];
						if(i!=t && connections[node.num-1][pot.num-1] && weights[node.num-1][pot.num-1] + weight < pot.weight){
							pot.weight=weights[node.num-1][pot.num-1] + weight;
							dj.offer(pot);
						}
					}
				}
				if (n[E-1].visited && n[E-1].weight <= T){
					escaped++;
				}
				for(int i = 0; i < N; i++){
					n[i] = new Node(i+1);
				}
			}
			System.out.println(escaped);
		}
	}
}
class Node implements Comparable<Node>{
	public int num, weight;
	public boolean visited;
	public Node(int N){
		num=N; weight=Integer.MAX_VALUE;
		visited=false;
	}
	public int compareTo(Node n){
		return weight - n.weight;
	}
	public String toString(){
		return String.format("%d %d %b", num, weight, visited);
	}
}