/*
ID: student27
LANG: JAVA
TASK: dualpal
*/
import java.io.*;
public class dualpal{
	static boolean pal(String str){
		return str.equals(new StringBuffer(str).reverse().toString()) && !(str.charAt(str.length()-1)=='0' || str.charAt(0)=='0');
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new FileReader("dualpal.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("dualpal.out")));
		String[] line=key.readLine().split(" ");
		int n=Integer.parseInt(line[0]), s=Integer.parseInt(line[1]);
		while(n!=0){
			s++;
			int count=0;
			for(int i = 2; i<=10; i++){
				if (pal(Integer.toString(s,i))){
					count++;
				}
			}
			if(count>=2){
				out.println(s);
				n--;
			}
		}
		out.close();
	}
}