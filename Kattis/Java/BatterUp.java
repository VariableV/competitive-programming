import java.io.*;
public class BatterUp{
	public static void main(String[] args)throws Exception{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(key.readLine());
		String[] line=key.readLine().split(" ");
		double avg=0;
		for(String str : line){
			if (str.equals("-1")){
				n--;
			}
			else{
				avg += Double.parseDouble(str);
			}
		}
		System.out.println(avg/(double)n);
	}
}