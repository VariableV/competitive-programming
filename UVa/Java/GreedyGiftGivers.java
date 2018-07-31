import java.util.*;
import java.io.*;
public class GreedyGiftGivers{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int T=0;
		while(true){
			String line=key.readLine();
			if(line==null)break;
			if (T++>0){
				System.out.println();
			}
			int pnum=Integer.parseInt(line);
			Map<String, Integer> people=new LinkedHashMap<>();
			line=key.readLine();
			String[] tmp=line.split("\\s+");
			for(String str : tmp){
				people.put(str,0);
			}
			for(int i = 0; i < pnum; i++){
				line=key.readLine();
				String[] tokens=line.split("\\s+");
				String name=tokens[0];
				int giveaway=Integer.parseInt(tokens[1]), npeople=Integer.parseInt(tokens[2]);
				for(int c=1; c<=npeople; c++){
					String p=tokens[2+c];
					try{
						people.put(p, people.get(p)+giveaway/npeople);
					}catch(Exception e){}
				}
				try{people.put(name, people.get(name)-(giveaway/npeople*npeople));}catch(Exception e){}
			}
			for(String pkey : people.keySet()){
				System.out.printf("%s %d\n", pkey, people.get(pkey));
			}
		}
	}
}