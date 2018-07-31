import java.io.*;
public class ToiletSeat{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		char[] toiletlining=key.readLine().toCharArray();
		int a=toiletlining[0] == 'D' ? 1 : 0;
		for(int i = 1; i < toiletlining.length; i++){
			if (a==1 && i==1 && toiletlining[i]=='D') continue;
			a+= toiletlining[i]=='D' ? 2 : 0;
		}
		System.out.println(a);
		a=toiletlining[0] == 'U' ? 1 : 0;
		for(int i = 1; i < toiletlining.length; i++){
			if (a==1 && i==1 && toiletlining[i]=='U') continue;
			a+= toiletlining[i]=='U' ? 2 : 0;
		}
		System.out.println(a);
		boolean[] arr=new boolean[toiletlining.length];
		arr[0]=toiletlining[0]=='U' ? true : false;
		a=0;
		for(int i = 1; i < arr.length; i++){
			if (arr[i-1]&&toiletlining[i]=='D'){
				a++;
			}
			else if(!arr[i-1]&&toiletlining[i]=='U'){
				a++;
			}
			arr[i]=toiletlining[i]=='D' ? false : true;
		}
		System.out.println(a);
	}
}