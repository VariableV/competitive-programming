import java.io.*;
public class Bijele{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String[] line=key.readLine().split(" ");
		String res="";
		int[] req={1,1,2,2,2,8};
		for(int i =0 ; i < line.length; i++){
			res += -(Integer.parseInt(line[i])-req[i]) + " ";
		}
		System.out.println(res.trim());
	}
}