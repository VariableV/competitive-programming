import java.util.*;
public class SecretResearch{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		int N=key.nextInt();
		while(N-->0){
			String num=key.next();
			if (num.equals("1") || num.equals("4") || num.equals("78")){
				System.out.println("+");
			}
			else if (num.matches("\\b\\d*(35)\\b")){
				System.out.println("-");
			}
			else if (num.matches("\\b(9)\\d*(4)\\b")){
				System.out.println("*");
			}
			else{
				System.out.println("?");
			}
		}
	}
}