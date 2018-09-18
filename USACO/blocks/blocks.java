import java.io.*;
import java.util.*;
public class blocks{
	static int[] frequency(char[] arr){
		int[] f = new int[26];
		for (int i = 0; i < arr.length; i++){
			f[arr[i] - (int)'a']++;
		}
		return f;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new FileReader("blocks.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));
		int n=Integer.parseInt(key.readLine());
		int[] alpha=new int[26];
		while(n-->0){
			String[] line=key.readLine().split(" ");
			int[] f1 = frequency(line[0].toCharArray()), f2 = frequency(line[1].toCharArray());
			for (int i = 0; i < 26; i++){
				alpha[i] += Math.max(f1[i], f2[i]);
			}
		}
		for(int i = 0; i < 26; i++){
			out.println(alpha[i]);
		}
		out.close();
	}
}