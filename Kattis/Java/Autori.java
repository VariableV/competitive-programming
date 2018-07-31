import java.io.*;
public class Autori{
	public static void main(String[] args)throws Exception{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String[] l=key.readLine().split("-");
		String res="";
		for(String str : l){
			res+=str.charAt(0);
		}
		System.out.println(res);
	}
}