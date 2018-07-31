import java.util.*;
public class GoogleIsFeelingLucky{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		int N=key.nextInt(),T=1;
		while(N-->0){
			System.out.printf("Case #%d:\n", T++);
			int maxint=Integer.MIN_VALUE;
			String[] webs=new String[10];
			int[] ranks=new int[10];
			for(int i = 0; i < 10; i++){
				webs[i]=key.next();
				int r=key.nextInt();
				if (r > maxint) maxint=r;
				ranks[i]=r;
			}
			for(int i = 0; i < 10; i++){
				if (ranks[i]==maxint){
					System.out.println(webs[i]);
				}
			}
		}
	}
}