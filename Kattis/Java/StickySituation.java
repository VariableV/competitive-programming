import java.io.*;
import java.util.*;
public class StickySituation{
	static boolean solved;
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int sticks=Integer.parseInt(key.readLine());
		String[] line=key.readLine().split(" ");
		long[] arr=new long[sticks];
		for(int i = 0; i < sticks; i++){
			arr[i]=Long.parseLong(line[i]);
		}
		long[] currsub=new long[3];
		solved=false;
		//subset(arr,currsub,0,0);
		Arrays.sort(arr);
		for(int i = 0; i < arr.length-2; i++){
			if (arr[i] + arr[i+1] > arr[i+2]){
				solved=true;
				break;
			}
		}
		System.out.printf("%s\n", solved ? "possible" : "impossible");
	}
	/*static void subset(long[]arr, long[] sub, int id, int ia){
		if (solved) return;
		if (id==3){
			Arrays.sort(sub);
			if (sub[0]+sub[1] > sub[2]){
				solved=true;
			}
			return;
		}
		if (ia>=arr.length) return;
		sub[id]=arr[ia];
		subset(arr, sub, id+1, ia+1);
		subset(arr, sub, id, ia+1);
	}*/
}