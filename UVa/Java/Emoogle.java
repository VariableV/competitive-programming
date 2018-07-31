import java.util.*;
public class Emoogle{
	public static void main(String[]args){
		Scanner key=new Scanner(System.in);
		int T=1;
		while(true){
			int N=key.nextInt(),a=0,b=0;
			if(N==0)break;
			while(N-->0){
				int num=key.nextInt();
				if (num==0)b++;
				else a++;
			}
			System.out.printf("Case %d: %d\n",T++,a-b);
		}
	}
}