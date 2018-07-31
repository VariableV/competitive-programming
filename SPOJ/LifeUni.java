import java.util.*;
public class LifeUni{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		while(true){
			int N=key.nextInt();
			if(N==42) break;
			System.out.println(N);
		}
		key.close();
	}
}