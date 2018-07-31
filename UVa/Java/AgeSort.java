import java.io.*;
import java.util.*;
public class AgeSort{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int N=Integer.parseInt(key.readLine());
			if (N==0)break;
			String[] nums=key.readLine().split("\\s+");
			int[] list=new int[N];
			for(int i = 0; i < nums.length; i++){
				list[i]=Integer.parseInt(nums[i]);
			}
			Arrays.sort(list);
			System.out.println(Arrays.toString(list).replaceAll("[\\[\\],]","").trim());
		}
	}
}