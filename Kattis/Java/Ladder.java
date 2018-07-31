import java.io.*;
public class Ladder{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String[] line=key.readLine().split(" ");
		double x=Integer.parseInt(line[0]),y=Integer.parseInt(line[1]);
		System.out.printf("%d\n", (int)Math.ceil(x/Math.sin(Math.toRadians(y))));
	}
}