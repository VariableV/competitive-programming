/*
ID: student27
LANG: JAVA
TASK: beads
*/
import java.io.*;
public class beads{
	static char[] str;
	static int slen;
	static int mod(int n, int m){
		while (n<0)
			n+=m;
		return n%m;
	}
	static int beadcount(int pos, boolean dir){
		int n=0;
		char color = 'w';
		if (!dir) pos--;
		for(int i = 0; i<slen; i++){
			char c=str[mod(pos+(dir ? i : -i),slen)];
			if (color == 'w' && c != 'w')
				color = c;

			if (color != 'w' && c != 'w' && c!=color)break;
			n++;
		}
		return n;
	}
	public static void main(String[] args)throws IOException{
		/*
		solution: 
		split the necklace at each position
		1. count beads forward that can be collected 
		2. count beads backwards that can be collected of the same color

		if the length of the maximum number of beads collected exceeds
		the necklace length, then the entire necklace can be used because
		it is uniform in bead color
		*/
		BufferedReader key=new BufferedReader(new FileReader("beads.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
		int len = Integer.parseInt(key.readLine());
		str = key.readLine().toCharArray();
		slen = str.length;
		int max=0;
		for(int i = 0; i < slen; i++){
			max = Math.max(beadcount(i, true)+beadcount(i, false),max);
		}
		max=Math.min(max,slen);
		out.println(max);
		out.close();
	}
}