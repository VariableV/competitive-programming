import java.io.*;
import java.util.*;
public class Cryptanalysis{
	static boolean int find(ArrayList<node> in, char value){
		for(int i = 0; i < in)
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<node> list=new ArrayList<>();
		int N=Intger.parseInt(key.readLine());

	}
}
class node implements Comparable<node>{
	char c;
	int n;
	public node(char c){
		this.c=c;
		n=1;
	}
	public int compareTo(node n){
		if (n.n==this.n){
			return c-n.c;
		}
		else{
			return this.n-n.n;
		}
	}
}