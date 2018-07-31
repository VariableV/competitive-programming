import java.io.*;
import java.util.*;
public class StackingCups{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Cup> list=new ArrayList<>();
		int n=Integer.parseInt(key.readLine());
		while(n-->0){
			list.add(new Cup(key.readLine()));
		}
		Collections.sort(list);
		for(Cup c : list){
			System.out.println(c.cname);
		}
	}
}
class Cup implements Comparable<Cup>{
	public double radius;
	public String cname;
	public Cup(String str){
		String[] line=str.split(" ");
		boolean diameter=true;
		try{
			Double.parseDouble(line[0]);
		}
		catch(Exception e){
			diameter=false;
		}
		radius=diameter ? Double.parseDouble(line[0])/2 : Double.parseDouble(line[1]);
		cname=diameter ? line[1] : line[0];
	}
	public int compareTo(Cup c){
		if (radius==c.radius){
			return cname.compareTo(c.cname);
		}
		return (int)Math.round(radius-c.radius);
	}
}