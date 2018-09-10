/*
ID: student27
LANG: JAVA
TASK: palsquare
*/
import java.io.*;
public class palsquare{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new FileReader("palsquare.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("palsquare.out")));
		int b=Integer.parseInt(key.readLine());
		for(int i = 1; i<=300; i++){
			String sqrt = Integer.toString(i,b), sq=Integer.toString(i*i, b);
			if (sq.equals(new StringBuffer(sq).reverse().toString())){
				out.printf("%s %s\n", sqrt.toUpperCase(), sq.toUpperCase());
			}
		}
		out.close();
	}
}