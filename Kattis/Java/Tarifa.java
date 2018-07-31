import java.io.*;
public class Tarifa{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int inc=Integer.parseInt(key.readLine()),sum=inc, rollover=0;
		int n=Integer.parseInt(key.readLine());
		while(n-->0){
			sum -= Integer.parseInt(key.readLine());
			sum+=inc;
		}
		System.out.println(sum);
	}
}