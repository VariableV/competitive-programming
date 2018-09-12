/*
ID: student27
LANG: JAVA
TASK: milk
*/
import java.io.*;
import java.util.*;
public class milk{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new FileReader("milk.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("milk.out")));
		String[] line=key.readLine().split(" ");
		int required=Integer.parseInt(line[0]), n=Integer.parseInt(line[1]);
		farmer[] prices=new farmer[n];
		for(int i =0; i < n; i++){
			line=key.readLine().split(" ");
			int c=Integer.parseInt(line[0]), a=Integer.parseInt(line[1]);
			prices[i] = new farmer(c,a);
		}
		int totalcost = 0, fulfilled=0;
		Arrays.sort(prices);
		for (int i = 0; i < n && required > 0; i++){
			farmer f=prices[i];
			if (f.amount < required){
				required -= f.amount;
				totalcost += f.cost * f.amount;
			}
			else if(f.amount >= required){
				totalcost += required * f.cost;
				required=0;
			}
		}
		out.println(totalcost);
		out.close();
	}
}
class farmer implements Comparable<farmer>{
	public int cost, amount;
	public farmer(int c, int a){
		cost=c; amount=a;
	}
	public int compareTo(farmer f){
		if (cost == f.cost){
			return amount-f.amount;
		}
		return cost-f.cost;
	}
}