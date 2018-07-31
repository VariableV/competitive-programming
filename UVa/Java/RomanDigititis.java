import java.io.*;
import java.util.*;
public class RomanDigititis{
	static int find(char[] arr, char value){
		for(int i = 0; i < arr.length; i++){
			if (arr[i]==value) return i;
		}
		return -1;
	}
	static LinkedHashMap<Integer, String> rmap;
	static String itor(int n){
		String res="";
		Iterator<Integer> revit=rmap.keySet().iterator();
		while(revit.hasNext()){
			int val=(Integer)revit.next();
			while(n>=val){
				n-=val;
				res+=rmap.get(val);
			}
		}
		return res;
	}
	public static void main(String[] args)throws IOException{
		rmap=new LinkedHashMap<>();
		rmap.put(100,"c");rmap.put(90,"xc");rmap.put(50, "l");rmap.put(40, "xl");rmap.put(10, "x");rmap.put(9,"ix");rmap.put(5, "v");rmap.put(4,"iv");rmap.put(1, "i"); 
		char[] f={'i','v','x','l','c'};
		int[][] digits=new int[101][5];
		for(int i = 1; i < digits.length; i++){
			String cnvt=itor(i);
			int[] letters=new int[5];
			for(char c : cnvt.toCharArray()){
				int idx=find(f,c);
				letters[idx]++;
			}
			for(int r=0; r<5; r++){
				digits[i][r]=letters[r]+digits[i-1][r];
			}
		}
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=key.readLine())!=null){
			int n=Integer.parseInt(s);
			if (n==0)break;
			System.out.printf("%d: %d i, %d v, %d x, %d l, %d c\n", n, digits[n][0], digits[n][1], digits[n][2], digits[n][3], digits[n][4]);
		}
	}
}