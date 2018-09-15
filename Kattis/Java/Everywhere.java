import java.io.*;
import java.util.*;
public class Everywhere{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(key.readLine());
		while(n-->0){
			int t=Integer.parseInt(key.readLine());
			Set<String> s=new HashSet<>();
			while(t-->0){
				s.add(key.readLine());
			}
			System.out.println(s.size());
		}
	}
}