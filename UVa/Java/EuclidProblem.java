import java.io.*;
public class EuclidProblem{
	static int x,y,d;
	static void extendedeuclid(int a, int b){
		if (b==0){
			x=1; y=0; d=a; return;
		}
		extendedeuclid(b, a%b);
		int x1=y;
		int y1=x-(a/b)*y;
		x=x1;
		y=y1;
	}
	public static void main(String[]args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)),true);
		String s;
		while((s=key.readLine())!=null){
			String[] line=s.split("\\s+");
			int a=Integer.parseInt(line[0]),b=Integer.parseInt(line[1]);
			extendedeuclid(a,b);
			out.printf("%d %d %d\n", x, y, d);
		}
		out.close();
	}
}