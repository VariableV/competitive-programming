/*
ID: student27
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;
public class gift1{
	public static void main(String[] args)throws IOException{
		/*
		solution:
		simulate transactions
		*/
		BufferedReader key=new BufferedReader(new FileReader("gift1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
		int people = Integer.parseInt(key.readLine());
		LinkedHashMap<String, Integer> bank=new LinkedHashMap<>();
		while(people-->0){
			bank.put(key.readLine(), 0);
		}
		String name;
		while((name=key.readLine())!=null){
			String[] num=key.readLine().split("\\s+");
			int money=Integer.parseInt(num[0]), dist=Integer.parseInt(num[1]);
			if (dist==0) continue;
			bank.put(name, bank.get(name)-money+money%dist);
			for (int i = 0; i < dist; i++){
				name = key.readLine();
				bank.put(name, bank.get(name)+money/dist);
			}
		}
		for (String k : bank.keySet()){
			out.println(k + " " + bank.get(k));
		}
		out.close();
	}
}