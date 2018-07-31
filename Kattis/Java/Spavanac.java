import java.io.*;
public class Spavanac{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String[] l=key.readLine().split(" ");
		int h=Integer.parseInt(l[0])*60, m=Integer.parseInt(l[1]);
		h+=m;
		h-=45;
		if (h<0){
			int sub=h;
			h=23*60;
			h+=60+sub;
		}
		System.out.printf("%d %d\n", h/60, h%60);
	}
}