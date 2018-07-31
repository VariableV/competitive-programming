import java.util.*;
import java.io.*;
public class Zapping{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] line=key.readLine().split("\\s+");
			int from=Integer.parseInt(line[0]),to=Integer.parseInt(line[1]),tmp=from,m1=0,m2=0;
			if(from==-1&&to==-1)break;
			while(tmp!=to){
				if (++tmp==100)tmp=0;
				m1++;
			}
			while(from!=to){
				if(--from==-1) from=99;
				m2++;
			}
			System.out.println(Math.min(m1,m2));
		}
		key.close();
	}
}