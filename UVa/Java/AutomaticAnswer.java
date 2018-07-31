import java.util.*;
public class AutomaticAnswer{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		int N=key.nextInt();
		while(N-->0){
			System.out.println(Math.abs(((key.nextInt()*567/9+7492)*235/47-498)/10%10));
		}
	}
}