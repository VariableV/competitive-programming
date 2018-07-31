// uva101
import java.io.*;
import java.util.*;
public class Blocks{
	static int[] parents;
	static ArrayList<ArrayList<Integer>> stacks;
	static int[] search(int block){
		for(int i = 0; i < stacks.size(); i++){
			ArrayList<Integer> tmp=stacks.get(i);
			for(int c =0; c < tmp.size(); c++){
				if (tmp.get(c)==block){
					return new int[]{i,c};
				}
			}
		}
		return null;
	}
	static void rtrn(int stackindex, int maxindex){
		for(int i = maxindex-1; i >= 0; i--){
			int removed=stacks.get(stackindex).remove(i);
			stacks.get(parents[removed]).add(removed);
			parents[removed]=stackindex;
		}
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(key.readLine());
		parents=new int[N];
		stacks=new ArrayList<>();
		for(int i = 0; i < N; i++){
			parents[i]=i;
			ArrayList<Integer> l1=new ArrayList<>();
			l1.add(i);
			stacks.add(l1);
		}
		String line;
		while(!(line=key.readLine()).equals("quit")){
			String[] proc=line.split("\\s+");
			int a=Integer.parseInt(proc[1]),b=Integer.parseInt(proc[3]);
			int[] aidx=search(a), bidx=search(b);
			if (proc[0].equals("move")&&proc[2].equals("onto")){
				stacks.get(aidx[0]).remove(aidx[1]);
				stacks.get(bidx[0]).add(bidx[1], a);
				rtrn(aidx[0], aidx[1]);
				rtrn(bidx[0], bidx[1]);
			}
			if (proc[0].equals("move")&&proc[2].equals("over")){
				stacks.get(aidx[0]).remove(aidx[1]);
				stacks.get(bidx[0]).add(0, a);
				rtrn(aidx[0], aidx[1]);
			}
			if (proc[0].equals("pile")&&proc[2].equals("onto")){
				rtrn(bidx[0],bidx[1]);
				for(int i = stacks.get(aidx[0]).size()-1; i >= 0; i--){
					stacks.get(bidx[0]).add(bidx[1], stacks.get(aidx[0]).remove(i));
				}
			}
			if (proc[0].equals("pile")&&proc[2].equals("over")){
				for(int i = stacks.get(aidx[0]).size()-1; i >= 0; i--){
					stacks.get(bidx[0]).add(0, stacks.get(aidx[0]).remove(i));
				}	
			}
		}
		for(int i = 0; i < stacks.size(); i++){
			line = String.format("%d: ", i);
			for(int n : stacks.get(i)){
				line += n + " ";
			}
			System.out.println(line.trim());
		}
	}
}