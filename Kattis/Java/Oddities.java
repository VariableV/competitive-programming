import java.io.*;
public class Oddities{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(key.readLine());
		while(n-->0){
			int num=Integer.parseInt(key.readLine());
			System.out.printf("%d is %s\n", num, (num&1)==0 ? "even" : "odd");
		}
	}
}