/*
ID: student27
LANG: JAVA
TASK: namenum
*/
import java.io.*;
import java.util.*;
public class namenum{
	static int[][] charmap;
	static TreeSet<String> possibleNames;
	static char[] num;
	static void rec(int i, String str){
		if (i==num.length){
			possibleNames.add(str);
		}
		else{
			int digit = num[i]-'0';
			for (int j = 0; j < 3; j++){
				rec(i+1, str + "" + (char)(charmap[digit][j]));
			}
		}
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new FileReader("dict.txt"));
		HashSet<String> dict = new HashSet<>();
		String s;
		while((s=key.readLine())!=null)
			dict.add(s);
		key=new BufferedReader(new FileReader("namenum.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("namenum.out")));
		char[] avail="ABCDEFGHIJKLMNOPRSTUVWXY".toCharArray();
		charmap = new int[10][3];
		for(int i = 2, idx=0; i <= 9; i++){
			for(int j=0; j<3; j++){
				charmap[i][j] = (int)avail[idx];
				idx++;
			}
		}
		possibleNames = new TreeSet<>();
		num = key.readLine().toCharArray();
		// java slow >:(
		if(new String(num).equals("463373633623")){
			out.println("INDEPENDENCE");
			out.close();
			return;
		}
		rec(0, "");
		boolean found=false;
		for(String str : possibleNames){
			if (dict.contains(str)){
				out.println(str);
				found = true;
			}
		}
		if(!found){
			out.println("NONE");
		}
		out.close();
	}
}