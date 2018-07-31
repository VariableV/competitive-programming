import java.util.*;
import java.io.*;
public class ICanGuessTheDataStructure{
	public static void main(String[] args)throws IOException{
		BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line=input.readLine();
			if (line==null) break;
			int N=Integer.parseInt(line);
			Stack<Integer> struct1=new Stack<>();
			Queue<Integer> struct2=new LinkedList<>();
			PriorityQueue<Integer> struct3=new PriorityQueue<>((o1,o2) -> o2.compareTo(o1));
			ArrayList<Integer> res1=new ArrayList<>(), res2=new ArrayList<>(), res3=new ArrayList<>();
			ArrayList<Integer> finalres=new ArrayList<>();
			boolean one=true,two=true,three=true;
			while(N-->0){
				String[] cline = input.readLine().split("\\s+");
				int cmd = Integer.parseInt(cline[0]), x=Integer.parseInt(cline[1]);
				if (cmd==1){
					struct1.push(x);
					struct2.offer(x);
					struct3.offer(x);
				}
				else if (cmd==2){
					try{
						res1.add(struct1.pop());
						res2.add(struct2.poll());
						res3.add(struct3.poll());
					}
					catch(Exception e){}
					finalres.add(x);	
				}
			}
			if (!finalres.toString().equals(res1.toString())){
				one=false;
			}
			if (!finalres.toString().equals(res2.toString())){
				two=false;
			}
			if (!finalres.toString().equals(res3.toString())){
				three=false;
			}
			if (one && !two && !three){
				System.out.println("stack");
			}
			else if (!one && two && !three){
				System.out.println("queue");
			}
			else if (!one && !two && three){
				System.out.println("priority queue");
			}
			else if (!one && !two && !three){
				System.out.println("impossible");
			}
			else{
				System.out.println("not sure");
			}
		}
	}
}