import java.util.*;
public class TariffPlan{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		int N=key.nextInt(), T=1;
		while(N-->0){
			int mile=0,juice=0;
			int nums=key.nextInt();
			while(nums-->0){
				int num=key.nextInt();
				mile += (num/30+1)*10;
				juice += (num/60+1)*15;
			}
			if (mile==juice){
				System.out.printf("Case %d: Mile Juice %d\n", T++, mile);
			}
			else if (mile<juice){
				System.out.printf("Case %d: Mile %d\n", T++, mile);
			}
			else{
				System.out.printf("Case %d: Juice %d\n", T++, juice);
			}
		}
	}
}