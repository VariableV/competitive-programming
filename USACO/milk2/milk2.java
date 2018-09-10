/*
ID: student27
LANG: JAVA
TASK: milk2
*/
import java.io.*;
import java.util.*;
public class milk2{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new FileReader("milk2.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")));
		int n=Integer.parseInt(key.readLine());
		milkinterval[] miruku = new milkinterval[n];
		while(n-->0){
			String[] intervals=key.readLine().split(" ");
			miruku[miruku.length - (n+1)] = new milkinterval(Integer.parseInt(intervals[0]), Integer.parseInt(intervals[1]));
		}
		Arrays.sort(miruku);
		int start=miruku[0].start, end=miruku[0].end, li = end-start;
		for(int i = 1; i < miruku.length; i++){
			int s = miruku[i].start, e = miruku[i].end;
			if (s <= end){
				end = Math.max(e, end);
			}
			else{
				li = Math.max(li, end-start);
				end=e;
				start=s;
			}
		}

		String result = "" + li;
		start=miruku[0].start; end=miruku[0].end; li = 0;
		for(int i = 1; i < miruku.length; i++){
			int s = miruku[i].start, e = miruku[i].end;
			if (end > s && end < e){
				end = miruku[i].end;
			}
			else if (s > start && e < end){
				continue;
			}
			else{
				li = Math.max(s-end, li);
				end = e;
				start = s;
			}
		}
		out.println(result + " " + li);

		out.close();
	}
}
class milkinterval implements Comparable<milkinterval>{
	public int start,end;
	public milkinterval(int s, int e){
		start=s;
		end=e;
	}
	public int compareTo(milkinterval m){
		if (m.start==start){
			return end-m.end;
		}
		return start-m.start;
	}
	public String toString(){
		return String.format("(s: %d, e: %d)", start,end);
	}
}