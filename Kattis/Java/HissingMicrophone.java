import java.io.*;
public class HissingMicrophone{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("%s\n", key.readLine().indexOf("ss")!=-1 ? "hiss" : "no hiss");
	}
}