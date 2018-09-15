import java.io.*;
public class GrassSeed{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		double c=Double.parseDouble(key.readLine());
		int plots=Integer.parseInt(key.readLine());
		double sum=0;
		while(plots-->0){
			String[] line=key.readLine().split("\\s+");
			sum += Double.parseDouble(line[0]) * Double.parseDouble(line[1]);
		}
		System.out.printf("%.7f\n", sum * (double)c);
	}
}