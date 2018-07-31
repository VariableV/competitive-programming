import java.io.*;
public class Zamka{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int l=Integer.parseInt(key.readLine()),d=Integer.parseInt(key.readLine()),x=Integer.parseInt(key.readLine());
		for(int i = l; i<=d;i++){
			String num=i+"";
			int sum=0;
			for(char c : num.toCharArray()){
				sum += c-'0';
			}
			if (sum==x){
				System.out.println(i);
				break;
			}
		}
		for(int i = d; i>=l;i--){
			String num=i+"";
			int sum=0;
			for(char c : num.toCharArray()){
				sum += c-'0';
			}
			if (sum==x){
				System.out.println(i);
				break;
			}
		}
	}
}