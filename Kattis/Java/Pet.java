import java.io.*;
public class Pet{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int winner=-1,pts=-1;
		for(int i = 1; i <= 5; i++){
			String[] line=key.readLine().split(" ");
			int total=0;
			for(String str : line){
				total += Integer.parseInt(str);
			}
			if (total > pts){
				winner=i;
				pts=total;
			}
		}
		System.out.printf("%d %d\n", winner, pts);
	}
}