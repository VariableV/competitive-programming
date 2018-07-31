import java.io.*;
public class Different{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=key.readLine())!=null){
			String[] line=s.split(" ");
			long a=Long.parseLong(line[0]),b=Long.parseLong(line[1]);
			System.out.println(Math.abs(a-b));
		}
	}
}