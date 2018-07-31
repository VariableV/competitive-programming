import java.util.*;
public class CountOnCantor{
	public static void main(String[] arg){
		Scanner key=new Scanner(System.in);
		String[] prestored={"1/1","1/2","2/1"};
		String s;
		while(key.hasNextInt()){
			int N=key.nextInt();
			if (N<4){
				System.out.printf("TERM %d IS %s\n", N, prestored[N-1]);
			}
			else{
				int r=2, c=0, dirr=-1, dirc=1;
				for(int i = 4; i < N; i++){
					if (dirr==-1 && dirc==1){
						if (r+dirr < 0){
							dirr=0; dirc=1;
						}
					}
					else if (dirr==0&&dirc==1){
						dirr=1; dirc=-1;
					}
					else if (dirr==1&&dirc==0){
						dirr=-1; dirc=1;
					}
					else if (dirr==1&&dirc==-1){
						if (c+dirc < 0){
							dirr=1; dirc=0;
						}
					}
					r+=dirr; c+=dirc;
				}
				System.out.printf("TERM %d IS %d/%d\n", N, r+1, c+1);
			}
		}
	}
}