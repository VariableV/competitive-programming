import java.io.*;

public class filip{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String[] line=key.readLine().split(" ");
		int n1=Integer.parseInt((new StringBuffer(line[0])).reverse().toString()), n2=Integer.parseInt((new StringBuffer(line[1])).reverse().toString()) ;
		System.out.println(Math.max(n1,n2));
	}
}