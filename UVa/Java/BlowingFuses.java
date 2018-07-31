import java.util.*;
public class BlowingFuses{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		int T=0;
		while(true){
			if (T++>0){
				System.out.println();
			}
			int dev=key.nextInt(),ops=key.nextInt(),cap=key.nextInt(),reached=0,maxereached=0;
			if (dev==0&&ops==0&&cap==0)break;
			boolean blownup=false;
			int[] devamp=new int[dev];
			boolean[] trig=new boolean[dev];
			for(int i = 0; i < dev; i++){
				devamp[i]=key.nextInt();
			}
			while(ops-->0){
				if (blownup){
					key.nextInt();
					continue;
				}
				int tog=key.nextInt()-1;
				trig[tog]=!trig[tog];
				if (trig[tog]){
					reached+=devamp[tog];
					maxereached=Math.max(reached,maxereached);
					if (reached > cap){
						blownup=true;
					}
				}
				else{
					reached-=devamp[tog];
				}
			}
			System.out.printf("Sequence %d\n", T);
			if (blownup){
				System.out.println("Fuse was blown.");
			}
			else{
				System.out.println("Fuse was not blown.");
				System.out.printf("Maximal power consumption was %d amperes.\n", maxereached);
			}
		}
	}
}