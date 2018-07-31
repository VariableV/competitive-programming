// p*Math.pow(Math.E,-x)+q*Math.sin(x)+r*Math.cos(x)+s*Math.tan(x)+t*(x*x)+u
import java.io.*;
public class SolveIt{
	static double f(double p, double q, double r, double s, double t, double u, double x){
		return p*Math.pow(Math.E,-x)+q*Math.sin(x)+r*Math.cos(x)+s*Math.tan(x)+t*(x*x)+u; 
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str=key.readLine())!=null){
			String[] line=str.split(" ");
			double p=Integer.parseInt(line[0]), q=Integer.parseInt(line[1]),r=Integer.parseInt(line[2]),s=Integer.parseInt(line[3]),t=Integer.parseInt(line[4]),u=Integer.parseInt(line[5]);
			// if sign of one is not negative then no possible ans
			if (f(p,q,r,s,t,u,0)*f(p,q,r,s,t,u,1) > 0){
				System.out.println("No solution");
				continue;
			}
			double L=0, R=1;
			while(R-L>0.000000001){
				double M=(L+R)/2;
				if (f(p,q,r,s,t,u,M)<=0){
					R=M;
				}
				else{
					L=M;
				}
			}
			System.out.printf("%.4f\n",L);
		}
	}
}