import java.util.*;
public class JumpingMario{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		int T=key.nextInt();
		for(int i=1; i<=T; i++){
			int N=key.nextInt(),low=0,high=0;
			int previous=-1,next=key.nextInt();
			if (N!=1){
				for(int n=1; n<N; n++){
					// if next-previous < 0 high++, else low++
					previous=next;next=key.nextInt();
					if (next-previous <0){
						low++;
					}
					else if(next-previous >0){
						high++;
					}
				}	
			}
			System.out.printf("Case %d: %d %d\n", i,high,low);
		}
	}
}