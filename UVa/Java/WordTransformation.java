import java.io.*;
import java.util.*;
public class WordTransformation{
	static boolean validedge(String a, String b){
		if (a.length()!=b.length()) return false;
		int diff=0;
		for(int i = 0; i < a.length(); i++){
			if (a.charAt(i)!=b.charAt(i)) diff++;
		}
		return !(diff > 1);
	}
	public static void main(String[]args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(key.readLine()), tick=0;
		key.readLine();
		mainloop: while(true){
			if (tick++ > 0){
				System.out.println();
			}
			HashMap<String, ArrayList<String>> graph=new HashMap<>();
			String s;
			while(!(s=key.readLine()).equals("*")){
				if (!graph.containsKey(s)){
					graph.put(s, new ArrayList<>());
				}
				for(String str : graph.keySet()){
					if (!str.equals(s) && validedge(s,str)){
						graph.get(str).add(s);
						graph.get(s).add(str);
					}
				}
			}
			HashMap<String, Integer> dist=new HashMap<>();
			for(String k : graph.keySet()){
				dist.put(k, Integer.MAX_VALUE);
			}
			while(true){
				s=key.readLine();
				if (s==null) break mainloop;
				if (s.equals(""))break;
				String[] sp=s.split("\\s+");
				String start=sp[0], end=sp[1];
				HashSet<String> visited=new HashSet<>();
				Queue<String> bfs=new LinkedList<>();
				bfs.offer(start);
				dist.put(start, 0);
				while(bfs.size()>0){
					String node=bfs.poll();
					if (visited.contains(node))continue;
					visited.add(node);
					int distance=dist.get(node);
					ArrayList<String> nodes=graph.get(node);
					for(String potstr : nodes){
						if (distance + 1 < dist.get(potstr)){
							dist.put(potstr, distance+1);
							bfs.offer(potstr);
						}
					}
				}
				System.out.printf("%s %s %d\n", start, end, dist.get(end));
				for(String mstr : dist.keySet()){
					dist.put(mstr,Integer.MAX_VALUE);
				}
			}
		}
	}
}