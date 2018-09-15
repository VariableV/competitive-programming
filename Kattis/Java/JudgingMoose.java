import java.io.*;
public class JudgingMoose{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String[] str=key.readLine().split(" ");
		int r=Integer.parseInt(str[0]), l=Integer.parseInt(str[1]);
		if (r==0 && l==0){
			System.out.println("Not a moose");
			return;
		}
		System.out.printf("%s %d\n", r == l ? "Even" : "Odd" ,Math.max(r,l)*2);
	}
}