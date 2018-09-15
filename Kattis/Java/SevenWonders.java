import java.io.*;
import java.util.*;
public class SevenWonders{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		char[] arr=key.readLine().toCharArray();
		int[] freq=new int[3];
		for (int i = 0; i< arr.length; i++){
			switch(arr[i]){
				case 'T':
				freq[0]++;
				break;
				case 'G':
				freq[1]++;
				break;
				case 'C':
				freq[2]++;
				break;
			}
		}
		Arrays.sort(freq);
		int sum=freq[0] * 7;
		for (int i = 0; i < 3; i++){
			sum += freq[i] * freq[i];
		}
		System.out.println(sum);
	}
}