import java.util.*;
public class SummingDigits{
	static int s(int n){
		if (Integer.toString(n).length()==1)return n;
		int sum=0;
		while(n>0){
			sum+=n%10;
			n/=10;
		}
		return s(sum);
	}
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		while(true){
			int num=key.nextInt();
			if(num==0)break;
			System.out.println(s(Math.abs(num)));
		}
	}
}