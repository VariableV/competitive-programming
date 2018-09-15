import java.io.*;
public class NastyHacks{
	public static void main(String[ ]args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(key.readLine());
		while(n-->0){
			String[] line=key.readLine().split("\\s+");
			int r=Integer.parseInt(line[0]), e=Integer.parseInt(line[1]),c=Integer.parseInt(line[2]);
			e-=c;
			if(e==r){
				System.out.println("does not matter");
			}
			else if (e>r){
				System.out.println("advertise");
			}
			else{
				System.out.println("do not advertise");
			}
		}
	}
}