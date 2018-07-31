import java.io.*;
public class Planina{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(key.readLine());
		System.out.println((long)Math.pow(Math.pow(2,N)+1, 2));
	}
}