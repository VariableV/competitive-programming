import java.util.*;
public class ConsecutiveIntegers{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		while(true){
			int N=key.nextInt();
			if(N==-1)break;
			int A=-1,B=(int)Math.sqrt(N*2);
			for(int r=B; r >= 1; r--){
				if ((2*N+r-r*r)%(2*r)==0){
					A=(2*N+r-r*r)/(2*r);
					System.out.printf("%d = %d + ... + %d\n", N, A, A+r-1);
					break;
				}
			}
		}
	}
}