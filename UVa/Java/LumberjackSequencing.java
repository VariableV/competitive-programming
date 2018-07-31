import java.util.*;
import java.io.*;
public class LumberjackSequencing{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(key.readLine());
		System.out.println("Lumberjacks:");
		while(N-->0){
			String nums=key.readLine();
			String[] l=nums.split("\\s+");
			ArrayList<Integer> list=new ArrayList<>();
			for(String num : l){
				list.add(Integer.parseInt(num));
			}
			Collections.sort(list);
			boolean yes=false;
			if (list.toString().replaceAll("[\\[\\],]","").equals(nums)){
				yes=true;
			}
			Collections.reverse(list);
			if (list.toString().replaceAll("[\\[\\],]","").equals(nums)){
				yes=true;
			}
			if(yes){
				System.out.println("Ordered");
			}
			else{
				System.out.println("Unordered");
			}
		}
	}
}