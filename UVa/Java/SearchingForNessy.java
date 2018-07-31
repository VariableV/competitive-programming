import java.util.*;
public class SearchingForNessy{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		int N=key.nextInt();
		while(N-->0)
			System.out.println((key.nextInt()/3)*(key.nextInt()/3));
	}
}