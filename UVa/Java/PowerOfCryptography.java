import java.io.*;
public class PowerOfCryptography{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String str=key.readLine();
			if(str==null)break;
			double n=Double.parseDouble(str),p=Double.parseDouble(key.readLine());
			System.out.println((int)Math.round(Math.pow(p,1/n)));
		}
	}
}