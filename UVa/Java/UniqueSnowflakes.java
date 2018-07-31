import java.util.*;
import java.io.*;
public class UniqueSnowflakes{
	public static void main(String[]args)throws IOException{
		Scanner key=new Scanner(new File("cases.txt"));
		int T=key.nextInt();
		while(T-->0){
			int N=key.nextInt(), maxsize=0;
			HashSet<Integer> hs=new HashSet<>();
			while(N-->0){
				int num=key.nextInt();
				if(!hs.add(num)){
					hs.clear();
					hs.add(num);
				}
				maxsize=Math.max(maxsize,hs.size());
			}
			System.out.println(maxsize);
		}
	}
}