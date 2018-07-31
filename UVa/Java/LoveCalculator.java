import java.util.*;
public class LoveCalculator{
	static int s(int N){
		if (Integer.toString(N).length()==1) return N;
		int sum=0;
		while(N>0){
			sum+=N%10;
			N/=10;
		}
		return s(sum);
	}
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		while(key.hasNextLine()){
			String str1=key.nextLine().replaceAll("[^a-zA-Z]", ""),str2=key.nextLine().replaceAll("[^a-zA-Z]", "");
			int sum0=0,sum1=0;
			for(int i = 0; i < str1.length(); i++){
				char c = str1.charAt(i);
				if (Character.isUpperCase(c)){
					sum0+=c-('A'-1);
				}
				else{
					sum0+=c-('a'-1);
				}
			}
			for(int i = 0; i < str2.length(); i++){
				char c = str2.charAt(i);
				if (Character.isUpperCase(c)){
					sum1+=c-('A'-1);
				}
				else{
					sum1+=c-('a'-1);
				}
			}
			double s1=s(sum0),s2=s(sum1);
			System.out.printf("%.2f %%\n",Math.min(s1,s2)/Math.max(s1,s2)*100);
		}
	}
}